# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-bf98320e-4bc5-4f93-956d-3a3128506954` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-2432b716-8246-43ec-8697-5482bae5b500` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-4ee6b887-81b1-4306-b3ac-ec5610c66b22` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-b90848fd-3242-433a-a725-54950d17c4ee` |
| 5 | `POST /v1/credits/purchases` | 400 | 7 | `qa-bd6819c9-1f71-49bb-a793-8b47515cb275` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-9e0ed3a8-37a7-483a-b844-23ac828f4a58` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-234d88a3-665a-4602-87d2-5df38cf9d31e` |
| 8 | `POST /v1/auth/token` | 401 | 2 | `qa-b9283b4e-1b26-43b3-a066-643215c8d390` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3319cc90-3d64-40a3-adac-c1453ba31762` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-bfa86f83-7019-446e-a198-e64322681f81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf98320e-4bc5-4f93-956d-3a3128506954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf98320e-4bc5-4f93-956d-3a3128506954
Content-Type: application/json

--- request body ---
{"handle":"qa-465350cff39e","displayName":"QA 465350cff39e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf98320e-4bc5-4f93-956d-3a3128506954
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Location: /v1/accounts/qa-465350cff39e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fcd582de-2db4-4133-9f89-0cf698cb59fb","handle":"qa-465350cff39e","displayName":"QA 465350cff39e","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.277820966Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2432b716-8246-43ec-8697-5482bae5b500

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2432b716-8246-43ec-8697-5482bae5b500
Content-Type: application/json

--- request body ---
{"handle":"qa-38e82c12fb73","displayName":"QA 38e82c12fb73","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2432b716-8246-43ec-8697-5482bae5b500
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Location: /v1/accounts/qa-38e82c12fb73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f0b34389-b06d-4b18-96ab-51b0fe3ba28a","handle":"qa-38e82c12fb73","displayName":"QA 38e82c12fb73","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.311835479Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4ee6b887-81b1-4306-b3ac-ec5610c66b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee6b887-81b1-4306-b3ac-ec5610c66b22
Content-Type: application/json

--- request body ---
{"handle":"qa-465350cff39e","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ee6b887-81b1-4306-b3ac-ec5610c66b22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fcd582de-2db4-4133-9f89-0cf698cb59fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b90848fd-3242-433a-a725-54950d17c4ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b90848fd-3242-433a-a725-54950d17c4ee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38e82c12fb73","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b90848fd-3242-433a-a725-54950d17c4ee
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
Location: /v1/conversations/cnv_393ae7e2-36ed-4d97-9467-7ef129d0de9c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_393ae7e2-36ed-4d97-9467-7ef129d0de9c","subject":"Error contract","status":"open","region":"eu","participants":["qa-465350cff39e","qa-38e82c12fb73"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.370952583Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bd6819c9-1f71-49bb-a793-8b47515cb275

--- request headers ---
Accept: application/json
Idempotency-Key: qa-729381b024b94895816bc3a057d5892f
X-Correlation-Id: qa-bd6819c9-1f71-49bb-a793-8b47515cb275
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd6819c9-1f71-49bb-a793-8b47515cb275
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-bd6819c9-1f71-49bb-a793-8b47515cb275"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9e0ed3a8-37a7-483a-b844-23ac828f4a58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0ed3a8-37a7-483a-b844-23ac828f4a58
Content-Type: application/json

--- request body ---
{"handle":"qa-38e82c12fb73","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0ed3a8-37a7-483a-b844-23ac828f4a58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f0b34389-b06d-4b18-96ab-51b0fe3ba28a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-234d88a3-665a-4602-87d2-5df38cf9d31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-234d88a3-665a-4602-87d2-5df38cf9d31e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-234d88a3-665a-4602-87d2-5df38cf9d31e
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
correlation: qa-b9283b4e-1b26-43b3-a066-643215c8d390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9283b4e-1b26-43b3-a066-643215c8d390
Content-Type: application/json

--- request body ---
{"handle":"qa-38e82c12fb73","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9283b4e-1b26-43b3-a066-643215c8d390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9283b4e-1b26-43b3-a066-643215c8d390"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3319cc90-3d64-40a3-adac-c1453ba31762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3319cc90-3d64-40a3-adac-c1453ba31762
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3319cc90-3d64-40a3-adac-c1453ba31762
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
correlation: qa-bfa86f83-7019-446e-a198-e64322681f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa86f83-7019-446e-a198-e64322681f81
Content-Type: application/json

--- request body ---
{"handle":"qa-465350cff39e","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfa86f83-7019-446e-a198-e64322681f81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bfa86f83-7019-446e-a198-e64322681f81"}
```
