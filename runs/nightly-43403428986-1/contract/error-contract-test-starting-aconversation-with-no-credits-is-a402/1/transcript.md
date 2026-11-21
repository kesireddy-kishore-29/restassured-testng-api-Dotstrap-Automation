# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-2d7e3c53-9643-4b5c-84f9-683d945646ef` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-bc5dcbd8-0618-446c-805a-3c365c659c0c` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-20fe41a2-6959-404a-a7bd-e391039341e1` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-a02e2d14-df3a-4f44-af4c-59e5d07740bd` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-4aad21c5-fe6f-40cc-a89d-d3917f02a0e3` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-b4dbd3a6-5a17-466a-a4d8-d596b2e79685` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 45 | `qa-b3dc894b-fae4-448f-9b85-e292d2292f9b` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-9d0cc642-e210-4a12-ae5b-0e69d193c8c4` |
| 9 | `GET /v1/credits/balance` | 200 | 14 | `qa-8827b5fb-b0a5-47b3-8f13-a9a797b4e799` |
| 10 | `POST /v1/conversations` | 402 | 12 | `qa-266c4156-7a6d-49b5-879f-3c60c05f46de` |
| 11 | `GET /v1/credits/ledger` | 200 | 13 | `qa-9303690f-f342-4b87-945a-ca4c54a497d3` |
| 12 | `POST /v1/auth/token` | 200 | 22 | `qa-a589dc6f-1aa6-4064-bdbe-6859922f30ae` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e97c131f-ce6f-413c-b12a-1cc3a10f0699` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-47726617-fc72-480c-9e59-87a705c09156` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e451d962-6392-44da-9d51-fe72567d65d2` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-358f3d0e-72d7-4832-afea-ea0c03e652e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d7e3c53-9643-4b5c-84f9-683d945646ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d7e3c53-9643-4b5c-84f9-683d945646ef
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e7fc571001","displayName":"QA d1e7fc571001","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d7e3c53-9643-4b5c-84f9-683d945646ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Location: /v1/accounts/qa-d1e7fc571001
X-Served-Region: eu
Content-Length: 181

{"id":"acc_61bcbd73-f944-457a-8950-5d58d86029e8","handle":"qa-d1e7fc571001","displayName":"QA d1e7fc571001","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.738819734Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bc5dcbd8-0618-446c-805a-3c365c659c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc5dcbd8-0618-446c-805a-3c365c659c0c
Content-Type: application/json

--- request body ---
{"handle":"qa-7e64427faa1e","displayName":"QA 7e64427faa1e","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc5dcbd8-0618-446c-805a-3c365c659c0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Location: /v1/accounts/qa-7e64427faa1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29818871-05cf-4278-a52b-a8be507dd4db","handle":"qa-7e64427faa1e","displayName":"QA 7e64427faa1e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.769136930Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-20fe41a2-6959-404a-a7bd-e391039341e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20fe41a2-6959-404a-a7bd-e391039341e1
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e7fc571001","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-20fe41a2-6959-404a-a7bd-e391039341e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_61bcbd73-f944-457a-8950-5d58d86029e8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a02e2d14-df3a-4f44-af4c-59e5d07740bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a02e2d14-df3a-4f44-af4c-59e5d07740bd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e64427faa1e","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a02e2d14-df3a-4f44-af4c-59e5d07740bd
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
Location: /v1/conversations/cnv_7ff94f34-d576-4586-82c2-c6aba43933fc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7ff94f34-d576-4586-82c2-c6aba43933fc","subject":"Error contract","status":"open","region":"eu","participants":["qa-d1e7fc571001","qa-7e64427faa1e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.815209611Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7ff94f34-d576-4586-82c2-c6aba43933fc/messages
correlation: qa-4aad21c5-fe6f-40cc-a89d-d3917f02a0e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aad21c5-fe6f-40cc-a89d-d3917f02a0e3
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aad21c5-fe6f-40cc-a89d-d3917f02a0e3
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
Content-Length: 192

{"id":"msg_04a93e39-c8e4-48b9-98bb-1321bfbd2d83","conversationId":"cnv_7ff94f34-d576-4586-82c2-c6aba43933fc","sender":"qa-d1e7fc571001","body":"2","createdAt":"2026-11-13T09:42:07.848464753Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_7ff94f34-d576-4586-82c2-c6aba43933fc/messages
correlation: qa-b4dbd3a6-5a17-466a-a4d8-d596b2e79685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4dbd3a6-5a17-466a-a4d8-d596b2e79685
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4dbd3a6-5a17-466a-a4d8-d596b2e79685
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
Content-Length: 192

{"id":"msg_e2611013-22c3-4a4b-b8a5-701f0fdf1f0c","conversationId":"cnv_7ff94f34-d576-4586-82c2-c6aba43933fc","sender":"qa-d1e7fc571001","body":"3","createdAt":"2026-11-13T09:42:07.876125275Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7ff94f34-d576-4586-82c2-c6aba43933fc/messages
correlation: qa-b3dc894b-fae4-448f-9b85-e292d2292f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3dc894b-fae4-448f-9b85-e292d2292f9b
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3dc894b-fae4-448f-9b85-e292d2292f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_09c33a9e-19d0-4377-ad1d-2372a2475edf","conversationId":"cnv_7ff94f34-d576-4586-82c2-c6aba43933fc","sender":"qa-d1e7fc571001","body":"4","createdAt":"2026-11-13T09:42:07.908830077Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7ff94f34-d576-4586-82c2-c6aba43933fc/messages
correlation: qa-9d0cc642-e210-4a12-ae5b-0e69d193c8c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d0cc642-e210-4a12-ae5b-0e69d193c8c4
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d0cc642-e210-4a12-ae5b-0e69d193c8c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_86162b5f-8289-449d-8286-d5af14d730b1","conversationId":"cnv_7ff94f34-d576-4586-82c2-c6aba43933fc","sender":"qa-d1e7fc571001","body":"5","createdAt":"2026-11-13T09:42:07.956097719Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-8827b5fb-b0a5-47b3-8f13-a9a797b4e799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8827b5fb-b0a5-47b3-8f13-a9a797b4e799
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8827b5fb-b0a5-47b3-8f13-a9a797b4e799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_61bcbd73-f944-457a-8950-5d58d86029e8"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-266c4156-7a6d-49b5-879f-3c60c05f46de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-266c4156-7a6d-49b5-879f-3c60c05f46de
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e64427faa1e","subject":"One more","message":"Hi"}

--- response: 402 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-266c4156-7a6d-49b5-879f-3c60c05f46de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-266c4156-7a6d-49b5-879f-3c60c05f46de"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9303690f-f342-4b87-945a-ca4c54a497d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9303690f-f342-4b87-945a-ca4c54a497d3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9303690f-f342-4b87-945a-ca4c54a497d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_29bfc2f4-7bcb-4ed6-9ab9-c74dc5236786","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:07.738830680Z"},{"id":"led_cb433aba-86b5-4e9b-8dc2-080f22cf6036","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_7ff94f34-d576-4586-82c2-c6aba43933fc","createdAt":"2026-11-13T09:42:07.815194118Z"},{"id":"led_9e173987-9fd6-44b0-ad74-bbb474a27ab3","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_04a93e39-c8e4-48b9-98bb-1321bfbd2d83","createdAt":"2026-11-13T09:42:07.848455639Z"},{"id":"led_e073f91f-290b-4828-b16a-e4fb92c1c4db","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_e2611013-22c3-4a4b-b8a5-701f0fdf1f0c","createdAt":"2026-11-13T09:42:07.876110713Z"},{"id":"led_6e7e86e1-bc13-4c5b-a135-3ebcf9664468","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_09c33a9e-19d0-4377-ad1d-2372a2475edf","createdAt":"2026-11-13T09:42:07.908820312Z"},{"id":"led_f441a5a0-3ece-4517-a984-87ae84935bca","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_86162b5f-8289-449d-8286-d5af14d730b1","createdAt":"2026-11-13T09:42:07.956090048Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a589dc6f-1aa6-4064-bdbe-6859922f30ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a589dc6f-1aa6-4064-bdbe-6859922f30ae
Content-Type: application/json

--- request body ---
{"handle":"qa-7e64427faa1e","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a589dc6f-1aa6-4064-bdbe-6859922f30ae
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29818871-05cf-4278-a52b-a8be507dd4db"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e97c131f-ce6f-413c-b12a-1cc3a10f0699

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e97c131f-ce6f-413c-b12a-1cc3a10f0699
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e97c131f-ce6f-413c-b12a-1cc3a10f0699
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-47726617-fc72-480c-9e59-87a705c09156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47726617-fc72-480c-9e59-87a705c09156
Content-Type: application/json

--- request body ---
{"handle":"qa-7e64427faa1e","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47726617-fc72-480c-9e59-87a705c09156
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47726617-fc72-480c-9e59-87a705c09156"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e451d962-6392-44da-9d51-fe72567d65d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e451d962-6392-44da-9d51-fe72567d65d2
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e451d962-6392-44da-9d51-fe72567d65d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-358f3d0e-72d7-4832-afea-ea0c03e652e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358f3d0e-72d7-4832-afea-ea0c03e652e6
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e7fc571001","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-358f3d0e-72d7-4832-afea-ea0c03e652e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-358f3d0e-72d7-4832-afea-ea0c03e652e6"}
```
