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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-8a67428d-1fe2-4d3e-96df-8d4c19cfc378` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-e24c8040-fd86-4a4d-8e99-1d193381f1f4` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-9bd4e10f-10c0-4247-beed-3e32a37c3f80` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-67aa582b-3a47-4228-9beb-4417f805a4f4` |
| 5 | `POST /v1/credits/purchases` | 422 | 23 | `qa-3dd0892f-8448-4b17-85e2-986b2bfe4847` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-7271fbbb-0526-4b55-a9d4-b79b10756f81` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-30d42c8b-2144-45ed-9ec6-587eeef638e6` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-d1b76527-441b-4aa1-b8c4-ecff9b03470b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-680c00a9-58b9-4dc1-b05f-eb2b6a61863a` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-999aa000-4e79-47d4-8e9b-e0a48b2b03f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a67428d-1fe2-4d3e-96df-8d4c19cfc378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a67428d-1fe2-4d3e-96df-8d4c19cfc378
Content-Type: application/json

--- request body ---
{"handle":"qa-7b9756c71731","displayName":"QA 7b9756c71731","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a67428d-1fe2-4d3e-96df-8d4c19cfc378
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Location: /v1/accounts/qa-7b9756c71731
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5c3d530-3f95-47e1-ba48-e943da2ee609","handle":"qa-7b9756c71731","displayName":"QA 7b9756c71731","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.963539063Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e24c8040-fd86-4a4d-8e99-1d193381f1f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e24c8040-fd86-4a4d-8e99-1d193381f1f4
Content-Type: application/json

--- request body ---
{"handle":"qa-87cf832ed53f","displayName":"QA 87cf832ed53f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e24c8040-fd86-4a4d-8e99-1d193381f1f4
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
Location: /v1/accounts/qa-87cf832ed53f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bc6dfba-f6cb-41b4-8f35-b4dad0dc2a59","handle":"qa-87cf832ed53f","displayName":"QA 87cf832ed53f","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.011278156Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9bd4e10f-10c0-4247-beed-3e32a37c3f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bd4e10f-10c0-4247-beed-3e32a37c3f80
Content-Type: application/json

--- request body ---
{"handle":"qa-7b9756c71731","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bd4e10f-10c0-4247-beed-3e32a37c3f80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5c3d530-3f95-47e1-ba48-e943da2ee609"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-67aa582b-3a47-4228-9beb-4417f805a4f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67aa582b-3a47-4228-9beb-4417f805a4f4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-87cf832ed53f","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-67aa582b-3a47-4228-9beb-4417f805a4f4
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
Location: /v1/conversations/cnv_2df34dd5-9367-47c5-8838-e721cd2326a2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2df34dd5-9367-47c5-8838-e721cd2326a2","subject":"Error contract","status":"open","region":"eu","participants":["qa-7b9756c71731","qa-87cf832ed53f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.097621264Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3dd0892f-8448-4b17-85e2-986b2bfe4847

--- request headers ---
Accept: application/json
Idempotency-Key: qa-301f363e51b14bce8852b6debeeb76dc
X-Correlation-Id: qa-3dd0892f-8448-4b17-85e2-986b2bfe4847
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dd0892f-8448-4b17-85e2-986b2bfe4847
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-3dd0892f-8448-4b17-85e2-986b2bfe4847","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7271fbbb-0526-4b55-a9d4-b79b10756f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7271fbbb-0526-4b55-a9d4-b79b10756f81
Content-Type: application/json

--- request body ---
{"handle":"qa-87cf832ed53f","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7271fbbb-0526-4b55-a9d4-b79b10756f81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bc6dfba-f6cb-41b4-8f35-b4dad0dc2a59"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30d42c8b-2144-45ed-9ec6-587eeef638e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d42c8b-2144-45ed-9ec6-587eeef638e6
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30d42c8b-2144-45ed-9ec6-587eeef638e6
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
correlation: qa-d1b76527-441b-4aa1-b8c4-ecff9b03470b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1b76527-441b-4aa1-b8c4-ecff9b03470b
Content-Type: application/json

--- request body ---
{"handle":"qa-87cf832ed53f","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1b76527-441b-4aa1-b8c4-ecff9b03470b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1b76527-441b-4aa1-b8c4-ecff9b03470b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-680c00a9-58b9-4dc1-b05f-eb2b6a61863a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680c00a9-58b9-4dc1-b05f-eb2b6a61863a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-680c00a9-58b9-4dc1-b05f-eb2b6a61863a
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
correlation: qa-999aa000-4e79-47d4-8e9b-e0a48b2b03f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999aa000-4e79-47d4-8e9b-e0a48b2b03f5
Content-Type: application/json

--- request body ---
{"handle":"qa-7b9756c71731","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-999aa000-4e79-47d4-8e9b-e0a48b2b03f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-999aa000-4e79-47d4-8e9b-e0a48b2b03f5"}
```
