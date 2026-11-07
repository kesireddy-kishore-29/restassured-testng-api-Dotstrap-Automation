# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 384 | `qa-a659ddb6-26ea-4caa-a455-2f362c0394c5` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-98ad990f-405f-49d2-9fad-cc73008ef388` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-3344626a-e29a-4d08-adbc-066757056d48` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-0316eff0-5c2e-4870-a41c-deb6205c677d` |
| 5 | `POST /v1/accounts` | 400 | 33 | `qa-f2cd64c1-6213-4255-9c24-def2e10d81cb` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-05633942-775f-4022-bb47-043202cab016` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-91f32c28-b2a2-476f-8d85-a7110e575be5` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-b1aeb756-80c8-4cd6-b211-37686fdcc0c7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0f69cb22-211c-4301-9104-3606a01c493b` |
| 10 | `POST /v1/auth/token` | 401 | 35 | `qa-62dd4343-187f-4126-bf5c-182052b80700` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a659ddb6-26ea-4caa-a455-2f362c0394c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a659ddb6-26ea-4caa-a455-2f362c0394c5
Content-Type: application/json

--- request body ---
{"handle":"qa-f530f9189403","displayName":"QA f530f9189403","password":"****","region":"eu"}

--- response: 201 in 384 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a659ddb6-26ea-4caa-a455-2f362c0394c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-f530f9189403
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9ecc216-b2a1-45c5-8e41-c04d197b2ff2","handle":"qa-f530f9189403","displayName":"QA f530f9189403","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.634213046Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-98ad990f-405f-49d2-9fad-cc73008ef388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ad990f-405f-49d2-9fad-cc73008ef388
Content-Type: application/json

--- request body ---
{"handle":"qa-120ea9076909","displayName":"QA 120ea9076909","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ad990f-405f-49d2-9fad-cc73008ef388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-120ea9076909
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6adc31e5-6bea-42bc-9e77-b8b89ce569b6","handle":"qa-120ea9076909","displayName":"QA 120ea9076909","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.969847569Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3344626a-e29a-4d08-adbc-066757056d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3344626a-e29a-4d08-adbc-066757056d48
Content-Type: application/json

--- request body ---
{"handle":"qa-f530f9189403","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3344626a-e29a-4d08-adbc-066757056d48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9ecc216-b2a1-45c5-8e41-c04d197b2ff2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0316eff0-5c2e-4870-a41c-deb6205c677d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0316eff0-5c2e-4870-a41c-deb6205c677d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-120ea9076909","subject":"Error contract","message":"Hi"}

--- response: 201 in 64 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0316eff0-5c2e-4870-a41c-deb6205c677d
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
Location: /v1/conversations/cnv_86069ad4-08b6-40ec-b3f1-e48f39a4fa15
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_86069ad4-08b6-40ec-b3f1-e48f39a4fa15","subject":"Error contract","status":"open","region":"eu","participants":["qa-f530f9189403","qa-120ea9076909"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.178751864Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f2cd64c1-6213-4255-9c24-def2e10d81cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2cd64c1-6213-4255-9c24-def2e10d81cb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2cd64c1-6213-4255-9c24-def2e10d81cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-f2cd64c1-6213-4255-9c24-def2e10d81cb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-05633942-775f-4022-bb47-043202cab016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05633942-775f-4022-bb47-043202cab016
Content-Type: application/json

--- request body ---
{"handle":"qa-120ea9076909","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-05633942-775f-4022-bb47-043202cab016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6adc31e5-6bea-42bc-9e77-b8b89ce569b6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91f32c28-b2a2-476f-8d85-a7110e575be5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91f32c28-b2a2-476f-8d85-a7110e575be5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91f32c28-b2a2-476f-8d85-a7110e575be5
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
correlation: qa-b1aeb756-80c8-4cd6-b211-37686fdcc0c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1aeb756-80c8-4cd6-b211-37686fdcc0c7
Content-Type: application/json

--- request body ---
{"handle":"qa-120ea9076909","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1aeb756-80c8-4cd6-b211-37686fdcc0c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1aeb756-80c8-4cd6-b211-37686fdcc0c7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f69cb22-211c-4301-9104-3606a01c493b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f69cb22-211c-4301-9104-3606a01c493b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f69cb22-211c-4301-9104-3606a01c493b
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
correlation: qa-62dd4343-187f-4126-bf5c-182052b80700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62dd4343-187f-4126-bf5c-182052b80700
Content-Type: application/json

--- request body ---
{"handle":"qa-f530f9189403","password":"****"}

--- response: 401 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62dd4343-187f-4126-bf5c-182052b80700
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62dd4343-187f-4126-bf5c-182052b80700"}
```
