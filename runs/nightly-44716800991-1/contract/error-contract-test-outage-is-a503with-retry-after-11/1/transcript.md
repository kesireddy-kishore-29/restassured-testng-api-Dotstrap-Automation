# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-44377622-c29b-4ff3-b1e5-bb3da1e83b26` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-b571937b-98ae-4164-9bed-d97ea2dc42c1` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-689101d2-4deb-4c1a-a77c-df060e420ccb` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-65fed580-839c-45da-84b6-05f40a97f20a` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 20 | `qa-40dbe2be-2999-4b20-9205-764375dcef27` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-fe5695b1-df66-4cc7-82a2-f0d9eacc2f1e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-96be309d-0382-45dc-8e2a-276b02c64416` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-7aa580dc-016a-4222-ac27-6c294dd4dd6e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-178f79b5-4c66-40ac-a8a7-e845d7a1bc40` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-2f647ecc-9a0e-49cf-9e5f-17bc2878447f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-44377622-c29b-4ff3-b1e5-bb3da1e83b26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44377622-c29b-4ff3-b1e5-bb3da1e83b26
Content-Type: application/json

--- request body ---
{"handle":"qa-7b160808dc7b","displayName":"QA 7b160808dc7b","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-44377622-c29b-4ff3-b1e5-bb3da1e83b26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-7b160808dc7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3495236c-ee59-447b-ba5f-bd9bc4aee83e","handle":"qa-7b160808dc7b","displayName":"QA 7b160808dc7b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.857331192Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b571937b-98ae-4164-9bed-d97ea2dc42c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b571937b-98ae-4164-9bed-d97ea2dc42c1
Content-Type: application/json

--- request body ---
{"handle":"qa-e9805b1a83eb","displayName":"QA e9805b1a83eb","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b571937b-98ae-4164-9bed-d97ea2dc42c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-e9805b1a83eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6781f3a-bde9-49f3-8db5-3163a759f497","handle":"qa-e9805b1a83eb","displayName":"QA e9805b1a83eb","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.910641537Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-689101d2-4deb-4c1a-a77c-df060e420ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-689101d2-4deb-4c1a-a77c-df060e420ccb
Content-Type: application/json

--- request body ---
{"handle":"qa-7b160808dc7b","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-689101d2-4deb-4c1a-a77c-df060e420ccb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3495236c-ee59-447b-ba5f-bd9bc4aee83e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65fed580-839c-45da-84b6-05f40a97f20a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65fed580-839c-45da-84b6-05f40a97f20a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e9805b1a83eb","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-65fed580-839c-45da-84b6-05f40a97f20a
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
Location: /v1/conversations/cnv_4557db7a-a10e-4d0b-8f4a-e8b0922520a6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4557db7a-a10e-4d0b-8f4a-e8b0922520a6","subject":"Error contract","status":"open","region":"eu","participants":["qa-7b160808dc7b","qa-e9805b1a83eb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.981951372Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4557db7a-a10e-4d0b-8f4a-e8b0922520a6/read
correlation: qa-40dbe2be-2999-4b20-9205-764375dcef27

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e99cf5e7-b1d1-4eb2-b425-9eb2de3b0c20
X-Correlation-Id: qa-40dbe2be-2999-4b20-9205-764375dcef27
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40dbe2be-2999-4b20-9205-764375dcef27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_4557db7a-a10e-4d0b-8f4a-e8b0922520a6/read","correlationId":"qa-40dbe2be-2999-4b20-9205-764375dcef27"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fe5695b1-df66-4cc7-82a2-f0d9eacc2f1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe5695b1-df66-4cc7-82a2-f0d9eacc2f1e
Content-Type: application/json

--- request body ---
{"handle":"qa-e9805b1a83eb","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe5695b1-df66-4cc7-82a2-f0d9eacc2f1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6781f3a-bde9-49f3-8db5-3163a759f497"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96be309d-0382-45dc-8e2a-276b02c64416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96be309d-0382-45dc-8e2a-276b02c64416
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96be309d-0382-45dc-8e2a-276b02c64416
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
correlation: qa-7aa580dc-016a-4222-ac27-6c294dd4dd6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aa580dc-016a-4222-ac27-6c294dd4dd6e
Content-Type: application/json

--- request body ---
{"handle":"qa-e9805b1a83eb","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7aa580dc-016a-4222-ac27-6c294dd4dd6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7aa580dc-016a-4222-ac27-6c294dd4dd6e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-178f79b5-4c66-40ac-a8a7-e845d7a1bc40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-178f79b5-4c66-40ac-a8a7-e845d7a1bc40
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-178f79b5-4c66-40ac-a8a7-e845d7a1bc40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2f647ecc-9a0e-49cf-9e5f-17bc2878447f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f647ecc-9a0e-49cf-9e5f-17bc2878447f
Content-Type: application/json

--- request body ---
{"handle":"qa-7b160808dc7b","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f647ecc-9a0e-49cf-9e5f-17bc2878447f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f647ecc-9a0e-49cf-9e5f-17bc2878447f"}
```
