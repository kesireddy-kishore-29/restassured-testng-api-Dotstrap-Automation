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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-116bf8fe-c6f3-4ce8-8d46-54c0083072fa` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-7554edf1-4845-410b-8344-52d36f44442a` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-157eeb20-3bde-45b6-97d2-a327d5178d34` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-4a2421d5-0543-4707-9cf4-3333f6ba7426` |
| 5 | `POST /v1/conversations` | 422 | 5 | `qa-a50b7166-a124-489e-883f-20a96a3031c1` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-ad2932e7-e98a-48eb-82cf-1a491619c8a0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-782f7d5f-dca0-4b7c-909f-65adba2e8de2` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-e8fd5982-6666-43f9-a432-6716bab6b86e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-be0299c2-d298-4e77-b9ec-13b8baa505c2` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-f6193a8f-9bcd-41c5-b57d-d8908f0c9d8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-116bf8fe-c6f3-4ce8-8d46-54c0083072fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-116bf8fe-c6f3-4ce8-8d46-54c0083072fa
Content-Type: application/json

--- request body ---
{"handle":"qa-2269b9830e6e","displayName":"QA 2269b9830e6e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-116bf8fe-c6f3-4ce8-8d46-54c0083072fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-2269b9830e6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24a43ca7-2476-4735-b639-06fe4ff209ba","handle":"qa-2269b9830e6e","displayName":"QA 2269b9830e6e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.222493216Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7554edf1-4845-410b-8344-52d36f44442a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7554edf1-4845-410b-8344-52d36f44442a
Content-Type: application/json

--- request body ---
{"handle":"qa-9c4aa3f31fe9","displayName":"QA 9c4aa3f31fe9","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7554edf1-4845-410b-8344-52d36f44442a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-9c4aa3f31fe9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9f54840-85eb-4cc5-8455-86e51cc8b716","handle":"qa-9c4aa3f31fe9","displayName":"QA 9c4aa3f31fe9","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.262105178Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-157eeb20-3bde-45b6-97d2-a327d5178d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-157eeb20-3bde-45b6-97d2-a327d5178d34
Content-Type: application/json

--- request body ---
{"handle":"qa-2269b9830e6e","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-157eeb20-3bde-45b6-97d2-a327d5178d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24a43ca7-2476-4735-b639-06fe4ff209ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4a2421d5-0543-4707-9cf4-3333f6ba7426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a2421d5-0543-4707-9cf4-3333f6ba7426
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c4aa3f31fe9","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a2421d5-0543-4707-9cf4-3333f6ba7426
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
Location: /v1/conversations/cnv_d57db164-22b2-46bc-ab4f-df295e86ca31
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d57db164-22b2-46bc-ab4f-df295e86ca31","subject":"Error contract","status":"open","region":"eu","participants":["qa-2269b9830e6e","qa-9c4aa3f31fe9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.348310063Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a50b7166-a124-489e-883f-20a96a3031c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a50b7166-a124-489e-883f-20a96a3031c1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c4aa3f31fe9","subject":" ","message":"Hi"}

--- response: 422 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a50b7166-a124-489e-883f-20a96a3031c1
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-a50b7166-a124-489e-883f-20a96a3031c1","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ad2932e7-e98a-48eb-82cf-1a491619c8a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2932e7-e98a-48eb-82cf-1a491619c8a0
Content-Type: application/json

--- request body ---
{"handle":"qa-9c4aa3f31fe9","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad2932e7-e98a-48eb-82cf-1a491619c8a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9f54840-85eb-4cc5-8455-86e51cc8b716"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-782f7d5f-dca0-4b7c-909f-65adba2e8de2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782f7d5f-dca0-4b7c-909f-65adba2e8de2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-782f7d5f-dca0-4b7c-909f-65adba2e8de2
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
correlation: qa-e8fd5982-6666-43f9-a432-6716bab6b86e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8fd5982-6666-43f9-a432-6716bab6b86e
Content-Type: application/json

--- request body ---
{"handle":"qa-9c4aa3f31fe9","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8fd5982-6666-43f9-a432-6716bab6b86e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8fd5982-6666-43f9-a432-6716bab6b86e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be0299c2-d298-4e77-b9ec-13b8baa505c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0299c2-d298-4e77-b9ec-13b8baa505c2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be0299c2-d298-4e77-b9ec-13b8baa505c2
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
correlation: qa-f6193a8f-9bcd-41c5-b57d-d8908f0c9d8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6193a8f-9bcd-41c5-b57d-d8908f0c9d8c
Content-Type: application/json

--- request body ---
{"handle":"qa-2269b9830e6e","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6193a8f-9bcd-41c5-b57d-d8908f0c9d8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6193a8f-9bcd-41c5-b57d-d8908f0c9d8c"}
```
