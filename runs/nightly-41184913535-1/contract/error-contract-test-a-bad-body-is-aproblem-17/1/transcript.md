# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-cd924fa1-a7d3-41e4-aadf-0a0304dc0207` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-5f5b653c-ec09-4a20-a334-9e26670c2625` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-395c507c-b887-4d4f-9489-1116f9b79883` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-fa52db42-4b02-410a-aad2-e943c83d0f55` |
| 5 | `POST /v1/credits/purchases` | 422 | 16 | `qa-14c225e9-62f3-46ca-b995-000338a9e8d9` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-849c7390-f811-4747-b389-370d7bf9e7eb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-01cbbeb0-4f21-4a1c-9100-9598557d54d1` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-1befe1d5-40b2-427f-a4f4-c6da523345a9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ae0abd96-8449-401b-9ab6-d7004f8e324c` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-6b5402ec-c245-4a34-bb94-7643d0f84678` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd924fa1-a7d3-41e4-aadf-0a0304dc0207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd924fa1-a7d3-41e4-aadf-0a0304dc0207
Content-Type: application/json

--- request body ---
{"handle":"qa-165c949a55f7","displayName":"QA 165c949a55f7","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd924fa1-a7d3-41e4-aadf-0a0304dc0207
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Location: /v1/accounts/qa-165c949a55f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c015e2d5-6ab1-4a46-a933-dd6a792c6a31","handle":"qa-165c949a55f7","displayName":"QA 165c949a55f7","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.795709994Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f5b653c-ec09-4a20-a334-9e26670c2625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5b653c-ec09-4a20-a334-9e26670c2625
Content-Type: application/json

--- request body ---
{"handle":"qa-a5d58ecc8a3b","displayName":"QA a5d58ecc8a3b","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f5b653c-ec09-4a20-a334-9e26670c2625
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Location: /v1/accounts/qa-a5d58ecc8a3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_328563bd-c2a6-4aba-83ed-90de799ac189","handle":"qa-a5d58ecc8a3b","displayName":"QA a5d58ecc8a3b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.826875585Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-395c507c-b887-4d4f-9489-1116f9b79883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-395c507c-b887-4d4f-9489-1116f9b79883
Content-Type: application/json

--- request body ---
{"handle":"qa-165c949a55f7","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-395c507c-b887-4d4f-9489-1116f9b79883
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c015e2d5-6ab1-4a46-a933-dd6a792c6a31"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fa52db42-4b02-410a-aad2-e943c83d0f55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa52db42-4b02-410a-aad2-e943c83d0f55
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a5d58ecc8a3b","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa52db42-4b02-410a-aad2-e943c83d0f55
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
Location: /v1/conversations/cnv_7e57a2aa-f517-4c2f-9016-2cd2d7bb5ab0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7e57a2aa-f517-4c2f-9016-2cd2d7bb5ab0","subject":"Error contract","status":"open","region":"eu","participants":["qa-165c949a55f7","qa-a5d58ecc8a3b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.880743980Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-14c225e9-62f3-46ca-b995-000338a9e8d9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5823b51381724fa5807a68c0330659da
X-Correlation-Id: qa-14c225e9-62f3-46ca-b995-000338a9e8d9
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14c225e9-62f3-46ca-b995-000338a9e8d9
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-14c225e9-62f3-46ca-b995-000338a9e8d9","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-849c7390-f811-4747-b389-370d7bf9e7eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-849c7390-f811-4747-b389-370d7bf9e7eb
Content-Type: application/json

--- request body ---
{"handle":"qa-a5d58ecc8a3b","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-849c7390-f811-4747-b389-370d7bf9e7eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_328563bd-c2a6-4aba-83ed-90de799ac189"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01cbbeb0-4f21-4a1c-9100-9598557d54d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01cbbeb0-4f21-4a1c-9100-9598557d54d1
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01cbbeb0-4f21-4a1c-9100-9598557d54d1
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
correlation: qa-1befe1d5-40b2-427f-a4f4-c6da523345a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1befe1d5-40b2-427f-a4f4-c6da523345a9
Content-Type: application/json

--- request body ---
{"handle":"qa-a5d58ecc8a3b","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1befe1d5-40b2-427f-a4f4-c6da523345a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1befe1d5-40b2-427f-a4f4-c6da523345a9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae0abd96-8449-401b-9ab6-d7004f8e324c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae0abd96-8449-401b-9ab6-d7004f8e324c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae0abd96-8449-401b-9ab6-d7004f8e324c
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
correlation: qa-6b5402ec-c245-4a34-bb94-7643d0f84678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b5402ec-c245-4a34-bb94-7643d0f84678
Content-Type: application/json

--- request body ---
{"handle":"qa-165c949a55f7","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b5402ec-c245-4a34-bb94-7643d0f84678
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b5402ec-c245-4a34-bb94-7643d0f84678"}
```
