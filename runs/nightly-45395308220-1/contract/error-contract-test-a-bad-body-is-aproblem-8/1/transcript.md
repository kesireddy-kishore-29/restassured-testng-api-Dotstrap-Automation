# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-19a697d6-2494-4f8e-a45f-bd0679545a9f` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-7995e7ce-1dbb-42a7-a9cd-3eb3d18c82ff` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-296af1e9-38af-42be-9b7c-9250aadfc570` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-7082c068-9144-41f2-a9e3-e8e38d826284` |
| 5 | `PATCH /v1/accounts/me` | 422 | 13 | `qa-ed2f8f37-b250-45af-a854-8f35ed5b07af` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-d11cc211-be3d-4ee3-bafe-53c37f1f3cb2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ecc8a2b7-4274-463b-84e4-9e27594db299` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-e15c4864-c37b-4adc-bdf2-9c5275bebb64` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c5afdf6a-5e0d-43c1-aebd-49814c73a50b` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-99436bf8-a5c2-4bf7-942a-1deebb7cc110` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19a697d6-2494-4f8e-a45f-bd0679545a9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a697d6-2494-4f8e-a45f-bd0679545a9f
Content-Type: application/json

--- request body ---
{"handle":"qa-8fd7a99de17c","displayName":"QA 8fd7a99de17c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a697d6-2494-4f8e-a45f-bd0679545a9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-8fd7a99de17c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a03e3e9-1790-4753-aefe-8aa132c7692a","handle":"qa-8fd7a99de17c","displayName":"QA 8fd7a99de17c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.033988060Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7995e7ce-1dbb-42a7-a9cd-3eb3d18c82ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7995e7ce-1dbb-42a7-a9cd-3eb3d18c82ff
Content-Type: application/json

--- request body ---
{"handle":"qa-6fc387fd6b28","displayName":"QA 6fc387fd6b28","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7995e7ce-1dbb-42a7-a9cd-3eb3d18c82ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-6fc387fd6b28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1742baf-9f85-49db-bb5a-481c4b6c0cfc","handle":"qa-6fc387fd6b28","displayName":"QA 6fc387fd6b28","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.106233851Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-296af1e9-38af-42be-9b7c-9250aadfc570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-296af1e9-38af-42be-9b7c-9250aadfc570
Content-Type: application/json

--- request body ---
{"handle":"qa-8fd7a99de17c","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-296af1e9-38af-42be-9b7c-9250aadfc570
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a03e3e9-1790-4753-aefe-8aa132c7692a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7082c068-9144-41f2-a9e3-e8e38d826284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7082c068-9144-41f2-a9e3-e8e38d826284
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fc387fd6b28","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7082c068-9144-41f2-a9e3-e8e38d826284
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
Location: /v1/conversations/cnv_b4daada2-6348-42df-afd2-09c589b571b2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b4daada2-6348-42df-afd2-09c589b571b2","subject":"Error contract","status":"open","region":"eu","participants":["qa-8fd7a99de17c","qa-6fc387fd6b28"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.173570126Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ed2f8f37-b250-45af-a854-8f35ed5b07af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2f8f37-b250-45af-a854-8f35ed5b07af
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed2f8f37-b250-45af-a854-8f35ed5b07af
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-ed2f8f37-b250-45af-a854-8f35ed5b07af","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d11cc211-be3d-4ee3-bafe-53c37f1f3cb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d11cc211-be3d-4ee3-bafe-53c37f1f3cb2
Content-Type: application/json

--- request body ---
{"handle":"qa-6fc387fd6b28","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d11cc211-be3d-4ee3-bafe-53c37f1f3cb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1742baf-9f85-49db-bb5a-481c4b6c0cfc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecc8a2b7-4274-463b-84e4-9e27594db299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc8a2b7-4274-463b-84e4-9e27594db299
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecc8a2b7-4274-463b-84e4-9e27594db299
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
correlation: qa-e15c4864-c37b-4adc-bdf2-9c5275bebb64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15c4864-c37b-4adc-bdf2-9c5275bebb64
Content-Type: application/json

--- request body ---
{"handle":"qa-6fc387fd6b28","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e15c4864-c37b-4adc-bdf2-9c5275bebb64
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e15c4864-c37b-4adc-bdf2-9c5275bebb64"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5afdf6a-5e0d-43c1-aebd-49814c73a50b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5afdf6a-5e0d-43c1-aebd-49814c73a50b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5afdf6a-5e0d-43c1-aebd-49814c73a50b
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
correlation: qa-99436bf8-a5c2-4bf7-942a-1deebb7cc110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99436bf8-a5c2-4bf7-942a-1deebb7cc110
Content-Type: application/json

--- request body ---
{"handle":"qa-8fd7a99de17c","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99436bf8-a5c2-4bf7-942a-1deebb7cc110
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99436bf8-a5c2-4bf7-942a-1deebb7cc110"}
```
