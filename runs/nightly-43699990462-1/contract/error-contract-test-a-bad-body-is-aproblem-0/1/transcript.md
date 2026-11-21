# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-5f0c2eff-e6c3-4a2b-9ab0-0dcf419dc7f4` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-9b05171f-e17c-442f-a641-7c7c7ab4a246` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-2b2a453f-3c6c-4365-abdd-f751041524ef` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-1e366f3f-b92d-4db0-91e7-ffc04ae589c4` |
| 5 | `POST /v1/auth/token` | 400 | 7 | `qa-2519ead3-b2ca-4cb6-873d-9c412e8130e6` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-44ba3c47-fba4-4d16-a56e-8e53221e49f3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 58 | `qa-185d6f39-32a3-4c26-a6e1-846656e8bdc3` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-df85186d-66fe-46cc-bcc9-a143c5b8db99` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-e074f5ec-aaee-4e8d-9fe3-f438dbb816f1` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-a344686b-178f-4e46-b94e-7336972e419b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5f0c2eff-e6c3-4a2b-9ab0-0dcf419dc7f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f0c2eff-e6c3-4a2b-9ab0-0dcf419dc7f4
Content-Type: application/json

--- request body ---
{"handle":"qa-059c20d5bd2e","displayName":"QA 059c20d5bd2e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f0c2eff-e6c3-4a2b-9ab0-0dcf419dc7f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-059c20d5bd2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abea262a-61ca-4050-b479-bafd52998251","handle":"qa-059c20d5bd2e","displayName":"QA 059c20d5bd2e","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.074321835Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9b05171f-e17c-442f-a641-7c7c7ab4a246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b05171f-e17c-442f-a641-7c7c7ab4a246
Content-Type: application/json

--- request body ---
{"handle":"qa-824886ca697b","displayName":"QA 824886ca697b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b05171f-e17c-442f-a641-7c7c7ab4a246
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-824886ca697b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1d97ffd-056d-4894-87aa-2a07a7c02324","handle":"qa-824886ca697b","displayName":"QA 824886ca697b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.128741936Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2b2a453f-3c6c-4365-abdd-f751041524ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b2a453f-3c6c-4365-abdd-f751041524ef
Content-Type: application/json

--- request body ---
{"handle":"qa-059c20d5bd2e","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b2a453f-3c6c-4365-abdd-f751041524ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abea262a-61ca-4050-b479-bafd52998251"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e366f3f-b92d-4db0-91e7-ffc04ae589c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e366f3f-b92d-4db0-91e7-ffc04ae589c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-824886ca697b","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e366f3f-b92d-4db0-91e7-ffc04ae589c4
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
Location: /v1/conversations/cnv_0ccfd774-3389-4f02-b4ec-7df488d4a411
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0ccfd774-3389-4f02-b4ec-7df488d4a411","subject":"Error contract","status":"open","region":"eu","participants":["qa-059c20d5bd2e","qa-824886ca697b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.185049409Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2519ead3-b2ca-4cb6-873d-9c412e8130e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2519ead3-b2ca-4cb6-873d-9c412e8130e6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2519ead3-b2ca-4cb6-873d-9c412e8130e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-2519ead3-b2ca-4cb6-873d-9c412e8130e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44ba3c47-fba4-4d16-a56e-8e53221e49f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ba3c47-fba4-4d16-a56e-8e53221e49f3
Content-Type: application/json

--- request body ---
{"handle":"qa-824886ca697b","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-44ba3c47-fba4-4d16-a56e-8e53221e49f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1d97ffd-056d-4894-87aa-2a07a7c02324"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-185d6f39-32a3-4c26-a6e1-846656e8bdc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185d6f39-32a3-4c26-a6e1-846656e8bdc3
Content-Type: application/json

--- response: 204 in 58 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-185d6f39-32a3-4c26-a6e1-846656e8bdc3
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
correlation: qa-df85186d-66fe-46cc-bcc9-a143c5b8db99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df85186d-66fe-46cc-bcc9-a143c5b8db99
Content-Type: application/json

--- request body ---
{"handle":"qa-824886ca697b","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df85186d-66fe-46cc-bcc9-a143c5b8db99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df85186d-66fe-46cc-bcc9-a143c5b8db99"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e074f5ec-aaee-4e8d-9fe3-f438dbb816f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e074f5ec-aaee-4e8d-9fe3-f438dbb816f1
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e074f5ec-aaee-4e8d-9fe3-f438dbb816f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a344686b-178f-4e46-b94e-7336972e419b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a344686b-178f-4e46-b94e-7336972e419b
Content-Type: application/json

--- request body ---
{"handle":"qa-059c20d5bd2e","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a344686b-178f-4e46-b94e-7336972e419b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a344686b-178f-4e46-b94e-7336972e419b"}
```
