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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-a512967f-d6b3-4c8a-a7ab-465b653e5cab` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-e01bbb3d-1db1-4d07-a941-6efd50ccf0c2` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-6ca3edcc-8542-4c41-bb63-324cce99a3ed` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-7866efc9-ba78-45eb-bde1-97a0b0c17740` |
| 5 | `POST /v1/credits/purchases` | 422 | 16 | `qa-e2d67d18-8116-4973-8ff3-44692f042144` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-1ebc2d6c-83e6-46ce-a8ff-9793feb1dad7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b5a3652a-21fe-49bf-a89c-cd17ab10e655` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-0a8dad85-24c0-4b53-b3f7-2ff6e592e135` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3c3766a8-2ddf-40f1-b444-6a69d707c116` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-c4a104df-d62d-41bd-98b9-13277c58e82c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a512967f-d6b3-4c8a-a7ab-465b653e5cab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a512967f-d6b3-4c8a-a7ab-465b653e5cab
Content-Type: application/json

--- request body ---
{"handle":"qa-703a2e181f41","displayName":"QA 703a2e181f41","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a512967f-d6b3-4c8a-a7ab-465b653e5cab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Location: /v1/accounts/qa-703a2e181f41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba85fb72-6819-4249-a526-3af6b4a7a26d","handle":"qa-703a2e181f41","displayName":"QA 703a2e181f41","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.600334285Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e01bbb3d-1db1-4d07-a941-6efd50ccf0c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e01bbb3d-1db1-4d07-a941-6efd50ccf0c2
Content-Type: application/json

--- request body ---
{"handle":"qa-eb013a05ce73","displayName":"QA eb013a05ce73","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e01bbb3d-1db1-4d07-a941-6efd50ccf0c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Location: /v1/accounts/qa-eb013a05ce73
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f1d28e1-5b3a-4c9e-8067-672a0768c6a4","handle":"qa-eb013a05ce73","displayName":"QA eb013a05ce73","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.620056964Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ca3edcc-8542-4c41-bb63-324cce99a3ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca3edcc-8542-4c41-bb63-324cce99a3ed
Content-Type: application/json

--- request body ---
{"handle":"qa-703a2e181f41","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca3edcc-8542-4c41-bb63-324cce99a3ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba85fb72-6819-4249-a526-3af6b4a7a26d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7866efc9-ba78-45eb-bde1-97a0b0c17740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7866efc9-ba78-45eb-bde1-97a0b0c17740
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eb013a05ce73","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7866efc9-ba78-45eb-bde1-97a0b0c17740
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
Location: /v1/conversations/cnv_f69b0895-c331-49ca-b7cf-84cae6485626
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f69b0895-c331-49ca-b7cf-84cae6485626","subject":"Error contract","status":"open","region":"eu","participants":["qa-703a2e181f41","qa-eb013a05ce73"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.710149851Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e2d67d18-8116-4973-8ff3-44692f042144

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b5b6b340702b41fe85270fee8bf51b89
X-Correlation-Id: qa-e2d67d18-8116-4973-8ff3-44692f042144
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2d67d18-8116-4973-8ff3-44692f042144
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-e2d67d18-8116-4973-8ff3-44692f042144","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1ebc2d6c-83e6-46ce-a8ff-9793feb1dad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ebc2d6c-83e6-46ce-a8ff-9793feb1dad7
Content-Type: application/json

--- request body ---
{"handle":"qa-eb013a05ce73","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ebc2d6c-83e6-46ce-a8ff-9793feb1dad7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f1d28e1-5b3a-4c9e-8067-672a0768c6a4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5a3652a-21fe-49bf-a89c-cd17ab10e655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5a3652a-21fe-49bf-a89c-cd17ab10e655
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5a3652a-21fe-49bf-a89c-cd17ab10e655
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
correlation: qa-0a8dad85-24c0-4b53-b3f7-2ff6e592e135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a8dad85-24c0-4b53-b3f7-2ff6e592e135
Content-Type: application/json

--- request body ---
{"handle":"qa-eb013a05ce73","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a8dad85-24c0-4b53-b3f7-2ff6e592e135
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a8dad85-24c0-4b53-b3f7-2ff6e592e135"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c3766a8-2ddf-40f1-b444-6a69d707c116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c3766a8-2ddf-40f1-b444-6a69d707c116
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c3766a8-2ddf-40f1-b444-6a69d707c116
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
correlation: qa-c4a104df-d62d-41bd-98b9-13277c58e82c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a104df-d62d-41bd-98b9-13277c58e82c
Content-Type: application/json

--- request body ---
{"handle":"qa-703a2e181f41","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4a104df-d62d-41bd-98b9-13277c58e82c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4a104df-d62d-41bd-98b9-13277c58e82c"}
```
