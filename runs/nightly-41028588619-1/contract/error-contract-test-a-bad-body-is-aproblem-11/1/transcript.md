# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-8fc1ec6b-865f-4dff-aa03-603e3ef1e588` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-a8545a0a-aee3-444e-94ac-2205678fbf2a` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-d22d1800-2da7-469e-af2e-8898341ba342` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-a5e4b44b-b583-4a09-b6ba-30a853ad09c6` |
| 5 | `POST /v1/conversations` | 422 | 14 | `qa-75b7eab6-4029-4b5f-9dc8-165ff0af6e4d` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-d429b0ac-b961-47ed-a8b0-7a7d16825a52` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-423b9f2c-5348-4978-a178-0ed8b9579636` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-d436d511-80ba-4e8f-8c6d-b0ed19daf0c1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2909abd8-777d-4d47-a9d0-c6c32de178e6` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-9eb9d0e7-c806-4be4-b393-16c3f83f1ee3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fc1ec6b-865f-4dff-aa03-603e3ef1e588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fc1ec6b-865f-4dff-aa03-603e3ef1e588
Content-Type: application/json

--- request body ---
{"handle":"qa-ad96eebfb3de","displayName":"QA ad96eebfb3de","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fc1ec6b-865f-4dff-aa03-603e3ef1e588
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Location: /v1/accounts/qa-ad96eebfb3de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d743d73b-0ba5-492b-a216-ec7d897deeea","handle":"qa-ad96eebfb3de","displayName":"QA ad96eebfb3de","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.615243699Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8545a0a-aee3-444e-94ac-2205678fbf2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8545a0a-aee3-444e-94ac-2205678fbf2a
Content-Type: application/json

--- request body ---
{"handle":"qa-e1829a889880","displayName":"QA e1829a889880","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8545a0a-aee3-444e-94ac-2205678fbf2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Location: /v1/accounts/qa-e1829a889880
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bfcdf74-798e-496a-b739-456c9127f24c","handle":"qa-e1829a889880","displayName":"QA e1829a889880","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.670025943Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d22d1800-2da7-469e-af2e-8898341ba342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22d1800-2da7-469e-af2e-8898341ba342
Content-Type: application/json

--- request body ---
{"handle":"qa-ad96eebfb3de","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d22d1800-2da7-469e-af2e-8898341ba342
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d743d73b-0ba5-492b-a216-ec7d897deeea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a5e4b44b-b583-4a09-b6ba-30a853ad09c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e4b44b-b583-4a09-b6ba-30a853ad09c6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e1829a889880","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e4b44b-b583-4a09-b6ba-30a853ad09c6
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
Location: /v1/conversations/cnv_79cabd8c-bdd2-46f3-beeb-a81476ac03e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_79cabd8c-bdd2-46f3-beeb-a81476ac03e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-ad96eebfb3de","qa-e1829a889880"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.736892860Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-75b7eab6-4029-4b5f-9dc8-165ff0af6e4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75b7eab6-4029-4b5f-9dc8-165ff0af6e4d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e1829a889880","subject":" ","message":"Hi"}

--- response: 422 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75b7eab6-4029-4b5f-9dc8-165ff0af6e4d
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-75b7eab6-4029-4b5f-9dc8-165ff0af6e4d","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d429b0ac-b961-47ed-a8b0-7a7d16825a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d429b0ac-b961-47ed-a8b0-7a7d16825a52
Content-Type: application/json

--- request body ---
{"handle":"qa-e1829a889880","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d429b0ac-b961-47ed-a8b0-7a7d16825a52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bfcdf74-798e-496a-b739-456c9127f24c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-423b9f2c-5348-4978-a178-0ed8b9579636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-423b9f2c-5348-4978-a178-0ed8b9579636
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-423b9f2c-5348-4978-a178-0ed8b9579636
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
correlation: qa-d436d511-80ba-4e8f-8c6d-b0ed19daf0c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d436d511-80ba-4e8f-8c6d-b0ed19daf0c1
Content-Type: application/json

--- request body ---
{"handle":"qa-e1829a889880","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d436d511-80ba-4e8f-8c6d-b0ed19daf0c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d436d511-80ba-4e8f-8c6d-b0ed19daf0c1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2909abd8-777d-4d47-a9d0-c6c32de178e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2909abd8-777d-4d47-a9d0-c6c32de178e6
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2909abd8-777d-4d47-a9d0-c6c32de178e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9eb9d0e7-c806-4be4-b393-16c3f83f1ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eb9d0e7-c806-4be4-b393-16c3f83f1ee3
Content-Type: application/json

--- request body ---
{"handle":"qa-ad96eebfb3de","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9eb9d0e7-c806-4be4-b393-16c3f83f1ee3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9eb9d0e7-c806-4be4-b393-16c3f83f1ee3"}
```
