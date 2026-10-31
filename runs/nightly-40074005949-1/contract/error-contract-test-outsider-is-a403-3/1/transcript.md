# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-a9f7f7d7-7b73-4776-ac36-d6e990771003` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-05d7eda7-db5a-46ea-bb47-66662ad5382b` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-e891eb7d-465e-43e2-bc5d-6d8862fba1c7` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-cfea7d88-977c-434e-a705-6e7b25b73268` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-2dd3f165-47e6-4c44-80af-48146a0a6459` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-4980fe22-2d6c-4290-93fe-79e5668366c1` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 15 | `qa-ddc70683-ab58-4019-a7d6-2c616b1f097d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-2d3cd25e-7b78-4ab2-a6d3-e806485bef65` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-9d48000f-debf-49b4-8e89-1e74ceb0bd52` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-120a05f9-6f12-4227-931b-0d4cd2cde55f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-f03de61f-7f3d-4a5d-b5fd-3decbda1c194` |
| 12 | `POST /v1/auth/token` | 401 | 15 | `qa-7eff78d9-8875-4b73-8318-8da38c76ad1f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-38b4a391-05a8-45a2-9b8c-3f39894e4441` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-6afb5cbe-c7d7-4e66-aa5d-765a0137bef1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9f7f7d7-7b73-4776-ac36-d6e990771003

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9f7f7d7-7b73-4776-ac36-d6e990771003
Content-Type: application/json

--- request body ---
{"handle":"qa-9ad3dea851d2","displayName":"QA 9ad3dea851d2","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9f7f7d7-7b73-4776-ac36-d6e990771003
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-9ad3dea851d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea67dd44-17e2-49e5-8861-b0af3f0a4e93","handle":"qa-9ad3dea851d2","displayName":"QA 9ad3dea851d2","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.824404502Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-05d7eda7-db5a-46ea-bb47-66662ad5382b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d7eda7-db5a-46ea-bb47-66662ad5382b
Content-Type: application/json

--- request body ---
{"handle":"qa-527ec99f75c0","displayName":"QA 527ec99f75c0","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-05d7eda7-db5a-46ea-bb47-66662ad5382b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-527ec99f75c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a153f3d6-80d2-422d-be14-f8dde6bd3708","handle":"qa-527ec99f75c0","displayName":"QA 527ec99f75c0","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.847986336Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e891eb7d-465e-43e2-bc5d-6d8862fba1c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e891eb7d-465e-43e2-bc5d-6d8862fba1c7
Content-Type: application/json

--- request body ---
{"handle":"qa-13fa0ea8bc96","displayName":"QA 13fa0ea8bc96","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e891eb7d-465e-43e2-bc5d-6d8862fba1c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Location: /v1/accounts/qa-13fa0ea8bc96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb2f8dff-3f69-4d4f-8ab1-148dd0bec636","handle":"qa-13fa0ea8bc96","displayName":"QA 13fa0ea8bc96","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.902633049Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-cfea7d88-977c-434e-a705-6e7b25b73268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfea7d88-977c-434e-a705-6e7b25b73268
Content-Type: application/json

--- request body ---
{"handle":"qa-9ad3dea851d2","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfea7d88-977c-434e-a705-6e7b25b73268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea67dd44-17e2-49e5-8861-b0af3f0a4e93"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2dd3f165-47e6-4c44-80af-48146a0a6459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dd3f165-47e6-4c44-80af-48146a0a6459
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-527ec99f75c0","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dd3f165-47e6-4c44-80af-48146a0a6459
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
Location: /v1/conversations/cnv_319bf9b4-d804-402f-bd98-bb37dbbdbcd7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_319bf9b4-d804-402f-bd98-bb37dbbdbcd7","subject":"Error contract","status":"open","region":"eu","participants":["qa-9ad3dea851d2","qa-527ec99f75c0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.012129135Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4980fe22-2d6c-4290-93fe-79e5668366c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4980fe22-2d6c-4290-93fe-79e5668366c1
Content-Type: application/json

--- request body ---
{"handle":"qa-13fa0ea8bc96","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4980fe22-2d6c-4290-93fe-79e5668366c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb2f8dff-3f69-4d4f-8ab1-148dd0bec636"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_319bf9b4-d804-402f-bd98-bb37dbbdbcd7/read
correlation: qa-ddc70683-ab58-4019-a7d6-2c616b1f097d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc70683-ab58-4019-a7d6-2c616b1f097d
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddc70683-ab58-4019-a7d6-2c616b1f097d
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_319bf9b4-d804-402f-bd98-bb37dbbdbcd7/read","correlationId":"qa-ddc70683-ab58-4019-a7d6-2c616b1f097d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d3cd25e-7b78-4ab2-a6d3-e806485bef65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d3cd25e-7b78-4ab2-a6d3-e806485bef65
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d3cd25e-7b78-4ab2-a6d3-e806485bef65
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-9d48000f-debf-49b4-8e89-1e74ceb0bd52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d48000f-debf-49b4-8e89-1e74ceb0bd52
Content-Type: application/json

--- request body ---
{"handle":"qa-13fa0ea8bc96","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d48000f-debf-49b4-8e89-1e74ceb0bd52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d48000f-debf-49b4-8e89-1e74ceb0bd52"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-120a05f9-6f12-4227-931b-0d4cd2cde55f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-120a05f9-6f12-4227-931b-0d4cd2cde55f
Content-Type: application/json

--- request body ---
{"handle":"qa-527ec99f75c0","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-120a05f9-6f12-4227-931b-0d4cd2cde55f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a153f3d6-80d2-422d-be14-f8dde6bd3708"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f03de61f-7f3d-4a5d-b5fd-3decbda1c194

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f03de61f-7f3d-4a5d-b5fd-3decbda1c194
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f03de61f-7f3d-4a5d-b5fd-3decbda1c194
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-7eff78d9-8875-4b73-8318-8da38c76ad1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eff78d9-8875-4b73-8318-8da38c76ad1f
Content-Type: application/json

--- request body ---
{"handle":"qa-527ec99f75c0","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7eff78d9-8875-4b73-8318-8da38c76ad1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7eff78d9-8875-4b73-8318-8da38c76ad1f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38b4a391-05a8-45a2-9b8c-3f39894e4441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38b4a391-05a8-45a2-9b8c-3f39894e4441
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38b4a391-05a8-45a2-9b8c-3f39894e4441
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-6afb5cbe-c7d7-4e66-aa5d-765a0137bef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6afb5cbe-c7d7-4e66-aa5d-765a0137bef1
Content-Type: application/json

--- request body ---
{"handle":"qa-9ad3dea851d2","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6afb5cbe-c7d7-4e66-aa5d-765a0137bef1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6afb5cbe-c7d7-4e66-aa5d-765a0137bef1"}
```
