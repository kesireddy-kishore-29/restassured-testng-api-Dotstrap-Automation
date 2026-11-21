# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-798457fa-9311-4828-aa7d-8a3203ef2ef7` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-a6c7f9a8-e890-4468-9cd4-1d8f32bd07ca` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-afd7ccff-c005-4cfb-be68-ae37ac514df6` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-293b0d9e-e4d1-48dc-914d-b684a5e39213` |
| 5 | `POST /v1/credits/purchases` | 415 | 15 | `qa-ea660b7b-e33d-43e7-832d-874a53766cc0` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-ccedf2c0-264b-49de-85b0-b7eead1db8b9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3d7beb4e-3d25-477a-9fd4-7cff6d0b915a` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-7f7ef9c6-8259-487c-895a-ab0a93c88ce0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-325c624c-6293-483c-a8e5-f722c448ad30` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-8d4cb9a6-acf0-4fab-b3bd-1098cbecd6c0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-798457fa-9311-4828-aa7d-8a3203ef2ef7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-798457fa-9311-4828-aa7d-8a3203ef2ef7
Content-Type: application/json

--- request body ---
{"handle":"qa-991f80879257","displayName":"QA 991f80879257","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-798457fa-9311-4828-aa7d-8a3203ef2ef7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Location: /v1/accounts/qa-991f80879257
X-Served-Region: eu
Content-Length: 181

{"id":"acc_673f1940-3e64-4b7c-b881-c96a8927875f","handle":"qa-991f80879257","displayName":"QA 991f80879257","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.041757065Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a6c7f9a8-e890-4468-9cd4-1d8f32bd07ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c7f9a8-e890-4468-9cd4-1d8f32bd07ca
Content-Type: application/json

--- request body ---
{"handle":"qa-b40f0f220403","displayName":"QA b40f0f220403","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6c7f9a8-e890-4468-9cd4-1d8f32bd07ca
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
Location: /v1/accounts/qa-b40f0f220403
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbe45af0-f655-40c5-a79f-a10f22ee978d","handle":"qa-b40f0f220403","displayName":"QA b40f0f220403","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.089132093Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-afd7ccff-c005-4cfb-be68-ae37ac514df6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd7ccff-c005-4cfb-be68-ae37ac514df6
Content-Type: application/json

--- request body ---
{"handle":"qa-991f80879257","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd7ccff-c005-4cfb-be68-ae37ac514df6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_673f1940-3e64-4b7c-b881-c96a8927875f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-293b0d9e-e4d1-48dc-914d-b684a5e39213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-293b0d9e-e4d1-48dc-914d-b684a5e39213
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b40f0f220403","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-293b0d9e-e4d1-48dc-914d-b684a5e39213
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
Location: /v1/conversations/cnv_ec503fbf-067b-4b22-831b-2e5944af3545
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ec503fbf-067b-4b22-831b-2e5944af3545","subject":"Error contract","status":"open","region":"eu","participants":["qa-991f80879257","qa-b40f0f220403"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:20.126501988Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ea660b7b-e33d-43e7-832d-874a53766cc0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ef155e1486624196a1a4fade991178a1
X-Correlation-Id: qa-ea660b7b-e33d-43e7-832d-874a53766cc0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea660b7b-e33d-43e7-832d-874a53766cc0
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-ea660b7b-e33d-43e7-832d-874a53766cc0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ccedf2c0-264b-49de-85b0-b7eead1db8b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccedf2c0-264b-49de-85b0-b7eead1db8b9
Content-Type: application/json

--- request body ---
{"handle":"qa-b40f0f220403","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccedf2c0-264b-49de-85b0-b7eead1db8b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbe45af0-f655-40c5-a79f-a10f22ee978d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d7beb4e-3d25-477a-9fd4-7cff6d0b915a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d7beb4e-3d25-477a-9fd4-7cff6d0b915a
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d7beb4e-3d25-477a-9fd4-7cff6d0b915a
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
correlation: qa-7f7ef9c6-8259-487c-895a-ab0a93c88ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f7ef9c6-8259-487c-895a-ab0a93c88ce0
Content-Type: application/json

--- request body ---
{"handle":"qa-b40f0f220403","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f7ef9c6-8259-487c-895a-ab0a93c88ce0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f7ef9c6-8259-487c-895a-ab0a93c88ce0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-325c624c-6293-483c-a8e5-f722c448ad30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325c624c-6293-483c-a8e5-f722c448ad30
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-325c624c-6293-483c-a8e5-f722c448ad30
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
correlation: qa-8d4cb9a6-acf0-4fab-b3bd-1098cbecd6c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d4cb9a6-acf0-4fab-b3bd-1098cbecd6c0
Content-Type: application/json

--- request body ---
{"handle":"qa-991f80879257","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d4cb9a6-acf0-4fab-b3bd-1098cbecd6c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d4cb9a6-acf0-4fab-b3bd-1098cbecd6c0"}
```
