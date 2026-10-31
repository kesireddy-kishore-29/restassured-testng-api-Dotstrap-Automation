# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-a26df9cb-ec99-49c9-9889-5f2476783b3b` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-5276555c-f855-48e1-9205-16fb5487b0fb` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-920f4544-e48b-4ead-aa04-54d19701f937` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-3a0a12a3-4de4-4168-9253-b4a302a7c87e` |
| 5 | `POST /v1/conversations` | 201 | 5 | `qa-8549d8ef-803f-449b-88de-da7495a8d721` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8c2f00d9-c390-4507-b1c9-91ee74c22ac0` |
| 7 | `GET /v1/conversations/{id}` | 403 | 20 | `qa-0923ff94-d763-4e3f-8840-b7da71dea5f6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-322e1b62-925b-4d0f-b606-5b47feca7634` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-4e4c6fab-7c07-475c-84fb-1e26a4f6073a` |
| 10 | `POST /v1/auth/token` | 200 | 61 | `qa-9fa0ef25-b0e1-4b9f-8e8c-83736b21fa07` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9d587bb6-28ca-4b0b-a2f1-7795960c6968` |
| 12 | `POST /v1/auth/token` | 401 | 27 | `qa-d59365e9-a754-42db-a179-eea5533ae43c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-2b6b3d41-56c0-48a4-96bf-97d76619c59d` |
| 14 | `POST /v1/auth/token` | 401 | 54 | `qa-df7f9b8e-3383-46a1-b227-1d42c0d8f18d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a26df9cb-ec99-49c9-9889-5f2476783b3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a26df9cb-ec99-49c9-9889-5f2476783b3b
Content-Type: application/json

--- request body ---
{"handle":"qa-704b6c60bd22","displayName":"QA 704b6c60bd22","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a26df9cb-ec99-49c9-9889-5f2476783b3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-704b6c60bd22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49c87336-c373-4c79-b4a0-261a8775dca4","handle":"qa-704b6c60bd22","displayName":"QA 704b6c60bd22","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.994349586Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5276555c-f855-48e1-9205-16fb5487b0fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5276555c-f855-48e1-9205-16fb5487b0fb
Content-Type: application/json

--- request body ---
{"handle":"qa-7dcf74d67b4e","displayName":"QA 7dcf74d67b4e","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5276555c-f855-48e1-9205-16fb5487b0fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-7dcf74d67b4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de7d2b4d-6934-4049-8f2f-f82d420773cb","handle":"qa-7dcf74d67b4e","displayName":"QA 7dcf74d67b4e","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.022548536Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-920f4544-e48b-4ead-aa04-54d19701f937

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-920f4544-e48b-4ead-aa04-54d19701f937
Content-Type: application/json

--- request body ---
{"handle":"qa-fb64edc11e52","displayName":"QA fb64edc11e52","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-920f4544-e48b-4ead-aa04-54d19701f937
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-fb64edc11e52
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c352cdf7-88a1-4f52-9e68-cf62db6ffc13","handle":"qa-fb64edc11e52","displayName":"QA fb64edc11e52","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.072466473Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3a0a12a3-4de4-4168-9253-b4a302a7c87e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0a12a3-4de4-4168-9253-b4a302a7c87e
Content-Type: application/json

--- request body ---
{"handle":"qa-704b6c60bd22","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0a12a3-4de4-4168-9253-b4a302a7c87e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49c87336-c373-4c79-b4a0-261a8775dca4"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8549d8ef-803f-449b-88de-da7495a8d721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8549d8ef-803f-449b-88de-da7495a8d721
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7dcf74d67b4e","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-8549d8ef-803f-449b-88de-da7495a8d721
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
Location: /v1/conversations/cnv_4836248f-3b9e-4f35-8701-99a37f6aff84
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4836248f-3b9e-4f35-8701-99a37f6aff84","subject":"Error contract","status":"open","region":"eu","participants":["qa-704b6c60bd22","qa-7dcf74d67b4e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:44.169818213Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8c2f00d9-c390-4507-b1c9-91ee74c22ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2f00d9-c390-4507-b1c9-91ee74c22ac0
Content-Type: application/json

--- request body ---
{"handle":"qa-fb64edc11e52","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2f00d9-c390-4507-b1c9-91ee74c22ac0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c352cdf7-88a1-4f52-9e68-cf62db6ffc13"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4836248f-3b9e-4f35-8701-99a37f6aff84
correlation: qa-0923ff94-d763-4e3f-8840-b7da71dea5f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0923ff94-d763-4e3f-8840-b7da71dea5f6
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0923ff94-d763-4e3f-8840-b7da71dea5f6
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4836248f-3b9e-4f35-8701-99a37f6aff84","correlationId":"qa-0923ff94-d763-4e3f-8840-b7da71dea5f6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-322e1b62-925b-4d0f-b606-5b47feca7634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-322e1b62-925b-4d0f-b606-5b47feca7634
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-322e1b62-925b-4d0f-b606-5b47feca7634
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4e4c6fab-7c07-475c-84fb-1e26a4f6073a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e4c6fab-7c07-475c-84fb-1e26a4f6073a
Content-Type: application/json

--- request body ---
{"handle":"qa-fb64edc11e52","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e4c6fab-7c07-475c-84fb-1e26a4f6073a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e4c6fab-7c07-475c-84fb-1e26a4f6073a"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9fa0ef25-b0e1-4b9f-8e8c-83736b21fa07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fa0ef25-b0e1-4b9f-8e8c-83736b21fa07
Content-Type: application/json

--- request body ---
{"handle":"qa-7dcf74d67b4e","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fa0ef25-b0e1-4b9f-8e8c-83736b21fa07
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de7d2b4d-6934-4049-8f2f-f82d420773cb"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d587bb6-28ca-4b0b-a2f1-7795960c6968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d587bb6-28ca-4b0b-a2f1-7795960c6968
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d587bb6-28ca-4b0b-a2f1-7795960c6968
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d59365e9-a754-42db-a179-eea5533ae43c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d59365e9-a754-42db-a179-eea5533ae43c
Content-Type: application/json

--- request body ---
{"handle":"qa-7dcf74d67b4e","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d59365e9-a754-42db-a179-eea5533ae43c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d59365e9-a754-42db-a179-eea5533ae43c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b6b3d41-56c0-48a4-96bf-97d76619c59d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b6b3d41-56c0-48a4-96bf-97d76619c59d
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b6b3d41-56c0-48a4-96bf-97d76619c59d
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-df7f9b8e-3383-46a1-b227-1d42c0d8f18d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7f9b8e-3383-46a1-b227-1d42c0d8f18d
Content-Type: application/json

--- request body ---
{"handle":"qa-704b6c60bd22","password":"****"}

--- response: 401 in 54 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df7f9b8e-3383-46a1-b227-1d42c0d8f18d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df7f9b8e-3383-46a1-b227-1d42c0d8f18d"}
```
