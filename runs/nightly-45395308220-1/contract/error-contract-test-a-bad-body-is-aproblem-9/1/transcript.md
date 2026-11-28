# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-7ece7509-4905-42b0-bdf8-8d46386476c7` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-d715bc0c-2f5d-4f16-82e7-039f766202ae` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-d52c5849-3ffa-4a83-bca4-6d4974676444` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-c8c002fa-45b6-4890-90b6-87458cd7cdb6` |
| 5 | `POST /v1/conversations` | 400 | 14 | `qa-fb7c18d6-c185-40f1-9d69-32af082ded06` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-931ec44e-d064-42e9-96e6-058e4087fea6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2a2e393d-05d0-4fd7-a768-e41cda9bb5d5` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-15ee97e5-e12e-4902-9510-26be5a3ba353` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-9e8648e6-57e7-4c8e-ba6d-49ebd65c467c` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-7158fe07-2c17-4c7c-aa68-37ab3d030cee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7ece7509-4905-42b0-bdf8-8d46386476c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ece7509-4905-42b0-bdf8-8d46386476c7
Content-Type: application/json

--- request body ---
{"handle":"qa-b2a027099c41","displayName":"QA b2a027099c41","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ece7509-4905-42b0-bdf8-8d46386476c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-b2a027099c41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6b836a1-af87-4a4d-b506-eb840fe591b7","handle":"qa-b2a027099c41","displayName":"QA b2a027099c41","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.047479919Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d715bc0c-2f5d-4f16-82e7-039f766202ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d715bc0c-2f5d-4f16-82e7-039f766202ae
Content-Type: application/json

--- request body ---
{"handle":"qa-8f0b18a4fe0e","displayName":"QA 8f0b18a4fe0e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d715bc0c-2f5d-4f16-82e7-039f766202ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-8f0b18a4fe0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f98dabf-9692-4e33-beed-ec4169916933","handle":"qa-8f0b18a4fe0e","displayName":"QA 8f0b18a4fe0e","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.142426199Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d52c5849-3ffa-4a83-bca4-6d4974676444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d52c5849-3ffa-4a83-bca4-6d4974676444
Content-Type: application/json

--- request body ---
{"handle":"qa-b2a027099c41","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d52c5849-3ffa-4a83-bca4-6d4974676444
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6b836a1-af87-4a4d-b506-eb840fe591b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8c002fa-45b6-4890-90b6-87458cd7cdb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c002fa-45b6-4890-90b6-87458cd7cdb6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f0b18a4fe0e","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8c002fa-45b6-4890-90b6-87458cd7cdb6
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
Location: /v1/conversations/cnv_b7bc3123-db9e-4999-8532-bfd14f5530d9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b7bc3123-db9e-4999-8532-bfd14f5530d9","subject":"Error contract","status":"open","region":"eu","participants":["qa-b2a027099c41","qa-8f0b18a4fe0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.208585074Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fb7c18d6-c185-40f1-9d69-32af082ded06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb7c18d6-c185-40f1-9d69-32af082ded06
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb7c18d6-c185-40f1-9d69-32af082ded06
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-fb7c18d6-c185-40f1-9d69-32af082ded06"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-931ec44e-d064-42e9-96e6-058e4087fea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-931ec44e-d064-42e9-96e6-058e4087fea6
Content-Type: application/json

--- request body ---
{"handle":"qa-8f0b18a4fe0e","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-931ec44e-d064-42e9-96e6-058e4087fea6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f98dabf-9692-4e33-beed-ec4169916933"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a2e393d-05d0-4fd7-a768-e41cda9bb5d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a2e393d-05d0-4fd7-a768-e41cda9bb5d5
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a2e393d-05d0-4fd7-a768-e41cda9bb5d5
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
correlation: qa-15ee97e5-e12e-4902-9510-26be5a3ba353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ee97e5-e12e-4902-9510-26be5a3ba353
Content-Type: application/json

--- request body ---
{"handle":"qa-8f0b18a4fe0e","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15ee97e5-e12e-4902-9510-26be5a3ba353
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15ee97e5-e12e-4902-9510-26be5a3ba353"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e8648e6-57e7-4c8e-ba6d-49ebd65c467c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e8648e6-57e7-4c8e-ba6d-49ebd65c467c
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e8648e6-57e7-4c8e-ba6d-49ebd65c467c
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
correlation: qa-7158fe07-2c17-4c7c-aa68-37ab3d030cee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7158fe07-2c17-4c7c-aa68-37ab3d030cee
Content-Type: application/json

--- request body ---
{"handle":"qa-b2a027099c41","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7158fe07-2c17-4c7c-aa68-37ab3d030cee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7158fe07-2c17-4c7c-aa68-37ab3d030cee"}
```
