# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-5e104040-2119-42d7-9509-a08f0a871784` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-b421d49f-023f-4669-9a1c-e22c05c408be` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-7484f394-50f1-4b77-a3ce-726f4aa555bc` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-3a471058-6c80-428c-ade4-b5b060bc9e43` |
| 5 | `POST /v1/accounts` | 503 | 20 | `qa-e26b92ca-abe4-4bd6-a095-9425124b233f` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-97dfff79-0745-4287-94b7-4e17ae249f28` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d1b5bdb7-8d27-40fa-89ad-76362c404f6e` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-b46de158-eae2-4db1-acf0-cc998f9cd2ae` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-eecb92ec-06a7-49dd-ac5a-632e70271de8` |
| 10 | `POST /v1/auth/token` | 401 | 41 | `qa-3d448fc8-198f-4254-91c4-24069edeb6c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e104040-2119-42d7-9509-a08f0a871784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e104040-2119-42d7-9509-a08f0a871784
Content-Type: application/json

--- request body ---
{"handle":"qa-70862c5fff2f","displayName":"QA 70862c5fff2f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e104040-2119-42d7-9509-a08f0a871784
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-70862c5fff2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af2d0c80-fe12-4422-92ac-a051c82485c0","handle":"qa-70862c5fff2f","displayName":"QA 70862c5fff2f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.096758895Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b421d49f-023f-4669-9a1c-e22c05c408be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b421d49f-023f-4669-9a1c-e22c05c408be
Content-Type: application/json

--- request body ---
{"handle":"qa-2db3d446bc49","displayName":"QA 2db3d446bc49","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b421d49f-023f-4669-9a1c-e22c05c408be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Location: /v1/accounts/qa-2db3d446bc49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df222a4a-9089-4ea6-86ef-ac07979ba223","handle":"qa-2db3d446bc49","displayName":"QA 2db3d446bc49","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.154079855Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7484f394-50f1-4b77-a3ce-726f4aa555bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7484f394-50f1-4b77-a3ce-726f4aa555bc
Content-Type: application/json

--- request body ---
{"handle":"qa-70862c5fff2f","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7484f394-50f1-4b77-a3ce-726f4aa555bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af2d0c80-fe12-4422-92ac-a051c82485c0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3a471058-6c80-428c-ade4-b5b060bc9e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a471058-6c80-428c-ade4-b5b060bc9e43
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2db3d446bc49","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a471058-6c80-428c-ade4-b5b060bc9e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_b19404bc-b5fb-487d-96dd-f46e66a8939d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b19404bc-b5fb-487d-96dd-f46e66a8939d","subject":"Error contract","status":"open","region":"eu","participants":["qa-70862c5fff2f","qa-2db3d446bc49"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.203303832Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e26b92ca-abe4-4bd6-a095-9425124b233f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c30e709c-0d4e-4a47-a6af-20c47fc267ad
X-Correlation-Id: qa-e26b92ca-abe4-4bd6-a095-9425124b233f
Content-Type: application/json

--- request body ---
{"handle":"qa-89688eb79149","displayName":"QA 89688eb79149","password":"****","region":"eu"}

--- response: 503 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e26b92ca-abe4-4bd6-a095-9425124b233f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-e26b92ca-abe4-4bd6-a095-9425124b233f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-97dfff79-0745-4287-94b7-4e17ae249f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97dfff79-0745-4287-94b7-4e17ae249f28
Content-Type: application/json

--- request body ---
{"handle":"qa-2db3d446bc49","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-97dfff79-0745-4287-94b7-4e17ae249f28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df222a4a-9089-4ea6-86ef-ac07979ba223"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1b5bdb7-8d27-40fa-89ad-76362c404f6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1b5bdb7-8d27-40fa-89ad-76362c404f6e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1b5bdb7-8d27-40fa-89ad-76362c404f6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-b46de158-eae2-4db1-acf0-cc998f9cd2ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b46de158-eae2-4db1-acf0-cc998f9cd2ae
Content-Type: application/json

--- request body ---
{"handle":"qa-2db3d446bc49","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b46de158-eae2-4db1-acf0-cc998f9cd2ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b46de158-eae2-4db1-acf0-cc998f9cd2ae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eecb92ec-06a7-49dd-ac5a-632e70271de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eecb92ec-06a7-49dd-ac5a-632e70271de8
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eecb92ec-06a7-49dd-ac5a-632e70271de8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3d448fc8-198f-4254-91c4-24069edeb6c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d448fc8-198f-4254-91c4-24069edeb6c8
Content-Type: application/json

--- request body ---
{"handle":"qa-70862c5fff2f","password":"****"}

--- response: 401 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d448fc8-198f-4254-91c4-24069edeb6c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d448fc8-198f-4254-91c4-24069edeb6c8"}
```
