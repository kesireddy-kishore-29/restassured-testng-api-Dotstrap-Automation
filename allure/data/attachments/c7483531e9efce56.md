# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-a3dc2306-13f2-4556-9a8f-4cee2b7c3485` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-18d8a815-f240-4824-973b-6d2c85b97772` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-bc217fe1-e068-4eeb-9fda-40519ab1c908` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-bb038c38-8d77-46c3-bcbf-f3723dfde0e3` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 55 | `qa-414fa8fc-b2b4-4d39-9d23-bc7ac068dbec` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-0a332b27-dc24-4f0a-bbee-11824efd2a55` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-8ab4dbe4-d6d2-4768-832f-6b1a6a5c2b1c` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-f9d7aba1-178f-42e3-af51-760849a0e187` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-24f0005a-adad-4672-81e4-ec9b13aa349a` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-40423c07-aae3-4b73-a07c-d80ad7e5cbaa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3dc2306-13f2-4556-9a8f-4cee2b7c3485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3dc2306-13f2-4556-9a8f-4cee2b7c3485
Content-Type: application/json

--- request body ---
{"handle":"qa-5f3c25402e90","displayName":"QA 5f3c25402e90","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3dc2306-13f2-4556-9a8f-4cee2b7c3485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Location: /v1/accounts/qa-5f3c25402e90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18734db2-2f30-4ee4-88a0-47878322b8ad","handle":"qa-5f3c25402e90","displayName":"QA 5f3c25402e90","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.431146323Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-18d8a815-f240-4824-973b-6d2c85b97772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d8a815-f240-4824-973b-6d2c85b97772
Content-Type: application/json

--- request body ---
{"handle":"qa-ca176a72cf15","displayName":"QA ca176a72cf15","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-18d8a815-f240-4824-973b-6d2c85b97772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Location: /v1/accounts/qa-ca176a72cf15
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e28b9f06-cbda-4f4c-94b7-cdfaa55d42de","handle":"qa-ca176a72cf15","displayName":"QA ca176a72cf15","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.469166355Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bc217fe1-e068-4eeb-9fda-40519ab1c908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc217fe1-e068-4eeb-9fda-40519ab1c908
Content-Type: application/json

--- request body ---
{"handle":"qa-5f3c25402e90","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc217fe1-e068-4eeb-9fda-40519ab1c908
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18734db2-2f30-4ee4-88a0-47878322b8ad"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb038c38-8d77-46c3-bcbf-f3723dfde0e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb038c38-8d77-46c3-bcbf-f3723dfde0e3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ca176a72cf15","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb038c38-8d77-46c3-bcbf-f3723dfde0e3
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
Location: /v1/conversations/cnv_bdf07dec-2cb4-44cc-a078-a1f793950be3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bdf07dec-2cb4-44cc-a078-a1f793950be3","subject":"Error contract","status":"open","region":"eu","participants":["qa-5f3c25402e90","qa-ca176a72cf15"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.542804177Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_bdf07dec-2cb4-44cc-a078-a1f793950be3/messages
correlation: qa-414fa8fc-b2b4-4d39-9d23-bc7ac068dbec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-414fa8fc-b2b4-4d39-9d23-bc7ac068dbec
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-414fa8fc-b2b4-4d39-9d23-bc7ac068dbec
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_bdf07dec-2cb4-44cc-a078-a1f793950be3/messages","correlationId":"qa-414fa8fc-b2b4-4d39-9d23-bc7ac068dbec","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a332b27-dc24-4f0a-bbee-11824efd2a55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a332b27-dc24-4f0a-bbee-11824efd2a55
Content-Type: application/json

--- request body ---
{"handle":"qa-ca176a72cf15","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a332b27-dc24-4f0a-bbee-11824efd2a55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e28b9f06-cbda-4f4c-94b7-cdfaa55d42de"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ab4dbe4-d6d2-4768-832f-6b1a6a5c2b1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ab4dbe4-d6d2-4768-832f-6b1a6a5c2b1c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ab4dbe4-d6d2-4768-832f-6b1a6a5c2b1c
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
correlation: qa-f9d7aba1-178f-42e3-af51-760849a0e187

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9d7aba1-178f-42e3-af51-760849a0e187
Content-Type: application/json

--- request body ---
{"handle":"qa-ca176a72cf15","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9d7aba1-178f-42e3-af51-760849a0e187
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9d7aba1-178f-42e3-af51-760849a0e187"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24f0005a-adad-4672-81e4-ec9b13aa349a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24f0005a-adad-4672-81e4-ec9b13aa349a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24f0005a-adad-4672-81e4-ec9b13aa349a
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
correlation: qa-40423c07-aae3-4b73-a07c-d80ad7e5cbaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40423c07-aae3-4b73-a07c-d80ad7e5cbaa
Content-Type: application/json

--- request body ---
{"handle":"qa-5f3c25402e90","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40423c07-aae3-4b73-a07c-d80ad7e5cbaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40423c07-aae3-4b73-a07c-d80ad7e5cbaa"}
```
