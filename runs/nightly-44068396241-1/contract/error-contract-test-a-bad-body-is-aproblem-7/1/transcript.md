# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-05355cbf-d9ea-4a9e-bc49-05898eb0f188` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-dd5eb0a4-3cd2-4b71-9462-9df4bedd27a0` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-dff1f354-9fac-4599-a4ed-33015de5c9d3` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-80e42ec5-3fb5-4996-9575-15efb9f26e99` |
| 5 | `PATCH /v1/accounts/me` | 415 | 14 | `qa-0cfad34d-bfdf-4d40-aa99-a66596072fd0` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-6a1be3df-5daf-4e70-b37f-2c2d52b5a869` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-cc3d08d4-b048-4c9d-81c2-5ab76e2d6784` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-9adc9f87-253e-44cd-ad3c-a202a128bc3f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-82ceb2d5-dfb3-47c4-98f9-698b94a85cbc` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-2394f37e-6a30-4a60-a19b-5715e0dd0cf7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-05355cbf-d9ea-4a9e-bc49-05898eb0f188

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05355cbf-d9ea-4a9e-bc49-05898eb0f188
Content-Type: application/json

--- request body ---
{"handle":"qa-8d0d49c54162","displayName":"QA 8d0d49c54162","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-05355cbf-d9ea-4a9e-bc49-05898eb0f188
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-8d0d49c54162
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3a59659-ee4b-46aa-a2e1-07f44ec88787","handle":"qa-8d0d49c54162","displayName":"QA 8d0d49c54162","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.920364387Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd5eb0a4-3cd2-4b71-9462-9df4bedd27a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd5eb0a4-3cd2-4b71-9462-9df4bedd27a0
Content-Type: application/json

--- request body ---
{"handle":"qa-20d415193352","displayName":"QA 20d415193352","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd5eb0a4-3cd2-4b71-9462-9df4bedd27a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-20d415193352
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7fa6639b-b5ba-47d5-a253-9958bbd590ff","handle":"qa-20d415193352","displayName":"QA 20d415193352","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.986421610Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dff1f354-9fac-4599-a4ed-33015de5c9d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff1f354-9fac-4599-a4ed-33015de5c9d3
Content-Type: application/json

--- request body ---
{"handle":"qa-8d0d49c54162","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-dff1f354-9fac-4599-a4ed-33015de5c9d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3a59659-ee4b-46aa-a2e1-07f44ec88787"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-80e42ec5-3fb5-4996-9575-15efb9f26e99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e42ec5-3fb5-4996-9575-15efb9f26e99
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-20d415193352","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-80e42ec5-3fb5-4996-9575-15efb9f26e99
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
Location: /v1/conversations/cnv_98facd54-8cab-4d21-81a2-1a49c900e6d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_98facd54-8cab-4d21-81a2-1a49c900e6d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d0d49c54162","qa-20d415193352"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.055502974Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-0cfad34d-bfdf-4d40-aa99-a66596072fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cfad34d-bfdf-4d40-aa99-a66596072fd0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cfad34d-bfdf-4d40-aa99-a66596072fd0
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-0cfad34d-bfdf-4d40-aa99-a66596072fd0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a1be3df-5daf-4e70-b37f-2c2d52b5a869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a1be3df-5daf-4e70-b37f-2c2d52b5a869
Content-Type: application/json

--- request body ---
{"handle":"qa-20d415193352","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a1be3df-5daf-4e70-b37f-2c2d52b5a869
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7fa6639b-b5ba-47d5-a253-9958bbd590ff"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc3d08d4-b048-4c9d-81c2-5ab76e2d6784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc3d08d4-b048-4c9d-81c2-5ab76e2d6784
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc3d08d4-b048-4c9d-81c2-5ab76e2d6784
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
correlation: qa-9adc9f87-253e-44cd-ad3c-a202a128bc3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9adc9f87-253e-44cd-ad3c-a202a128bc3f
Content-Type: application/json

--- request body ---
{"handle":"qa-20d415193352","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9adc9f87-253e-44cd-ad3c-a202a128bc3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9adc9f87-253e-44cd-ad3c-a202a128bc3f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82ceb2d5-dfb3-47c4-98f9-698b94a85cbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ceb2d5-dfb3-47c4-98f9-698b94a85cbc
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82ceb2d5-dfb3-47c4-98f9-698b94a85cbc
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
correlation: qa-2394f37e-6a30-4a60-a19b-5715e0dd0cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2394f37e-6a30-4a60-a19b-5715e0dd0cf7
Content-Type: application/json

--- request body ---
{"handle":"qa-8d0d49c54162","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2394f37e-6a30-4a60-a19b-5715e0dd0cf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2394f37e-6a30-4a60-a19b-5715e0dd0cf7"}
```
