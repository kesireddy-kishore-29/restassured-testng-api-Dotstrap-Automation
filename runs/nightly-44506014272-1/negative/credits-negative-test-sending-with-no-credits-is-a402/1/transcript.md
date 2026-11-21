# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-04053a62-7606-4159-811e-87012ce4c33f` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-16eead73-fc97-426f-893f-5288216623a2` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-8a322f2b-044b-41fb-93a5-724c9873a0ed` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-05406b91-f92e-4312-9720-8ac08354160b` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 30 | `qa-a90f832a-4554-4329-b115-0729fff5dba4` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-9611d86a-ddf5-42cd-b170-f7d6369c799c` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-ca827e21-ea4a-47b7-81c0-4f6bf40f9451` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-1e3b14a6-8dbe-465b-9505-cfd7831cd802` |
| 9 | `GET /v1/credits/balance` | 200 | 10 | `qa-f9e7607a-fcf2-47a7-ba8c-0b26a1078bb4` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 12 | `qa-2b0de433-fbad-4079-8cfd-f3faa33b5108` |
| 11 | `GET /v1/credits/ledger` | 200 | 14 | `qa-8b5b41c1-2195-4854-a3ee-9bd0a7d62085` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-c165e434-9bac-4ac9-9200-6ce68560d7a8` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-fa42d923-b82f-4c84-91e9-8d402dbf8fe3` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-7de6ba08-9483-4bfd-b0e0-2a7328ef1bfa` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8ff8737e-ad5d-4792-8fd6-a284a02e0fe4` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-35cbb015-fcf9-42db-93ad-5fa321837ffc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04053a62-7606-4159-811e-87012ce4c33f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04053a62-7606-4159-811e-87012ce4c33f
Content-Type: application/json

--- request body ---
{"handle":"qa-241c2e22aaee","displayName":"QA 241c2e22aaee","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-04053a62-7606-4159-811e-87012ce4c33f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-241c2e22aaee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4875c0ea-3875-4131-bac4-1b6d90eff866","handle":"qa-241c2e22aaee","displayName":"QA 241c2e22aaee","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.804157912Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-16eead73-fc97-426f-893f-5288216623a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16eead73-fc97-426f-893f-5288216623a2
Content-Type: application/json

--- request body ---
{"handle":"qa-1e407613ac39","displayName":"QA 1e407613ac39","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-16eead73-fc97-426f-893f-5288216623a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-1e407613ac39
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f11d139e-27ab-4c47-8ae3-a9b979808a82","handle":"qa-1e407613ac39","displayName":"QA 1e407613ac39","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.847429454Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a322f2b-044b-41fb-93a5-724c9873a0ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a322f2b-044b-41fb-93a5-724c9873a0ed
Content-Type: application/json

--- request body ---
{"handle":"qa-241c2e22aaee","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a322f2b-044b-41fb-93a5-724c9873a0ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4875c0ea-3875-4131-bac4-1b6d90eff866"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-05406b91-f92e-4312-9720-8ac08354160b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05406b91-f92e-4312-9720-8ac08354160b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1e407613ac39","subject":"Many messages","message":"1"}

--- response: 201 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-05406b91-f92e-4312-9720-8ac08354160b
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
Location: /v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db","subject":"Many messages","status":"open","region":"eu","participants":["qa-241c2e22aaee","qa-1e407613ac39"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:20.909578478Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db/messages
correlation: qa-a90f832a-4554-4329-b115-0729fff5dba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a90f832a-4554-4329-b115-0729fff5dba4
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a90f832a-4554-4329-b115-0729fff5dba4
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

{"id":"msg_dfcf7183-e58a-4189-aa78-06e7c85e0076","conversationId":"cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db","sender":"qa-241c2e22aaee","body":"2","createdAt":"2026-11-19T10:29:20.995370340Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db/messages
correlation: qa-9611d86a-ddf5-42cd-b170-f7d6369c799c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9611d86a-ddf5-42cd-b170-f7d6369c799c
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-9611d86a-ddf5-42cd-b170-f7d6369c799c
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

{"id":"msg_3b7c07bc-bdef-46a8-b1b5-78280c761d1f","conversationId":"cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db","sender":"qa-241c2e22aaee","body":"3","createdAt":"2026-11-19T10:29:21.033501304Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db/messages
correlation: qa-ca827e21-ea4a-47b7-81c0-4f6bf40f9451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca827e21-ea4a-47b7-81c0-4f6bf40f9451
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca827e21-ea4a-47b7-81c0-4f6bf40f9451
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

{"id":"msg_ef7424bc-0654-4569-83db-71b4c9cab231","conversationId":"cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db","sender":"qa-241c2e22aaee","body":"4","createdAt":"2026-11-19T10:29:21.051642614Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db/messages
correlation: qa-1e3b14a6-8dbe-465b-9505-cfd7831cd802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3b14a6-8dbe-465b-9505-cfd7831cd802
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e3b14a6-8dbe-465b-9505-cfd7831cd802
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

{"id":"msg_2f636185-183f-4bc0-a0dc-41a59664b266","conversationId":"cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db","sender":"qa-241c2e22aaee","body":"5","createdAt":"2026-11-19T10:29:21.068633506Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-f9e7607a-fcf2-47a7-ba8c-0b26a1078bb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9e7607a-fcf2-47a7-ba8c-0b26a1078bb4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9e7607a-fcf2-47a7-ba8c-0b26a1078bb4
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

{"balance":0,"currency":"credits","accountId":"acc_4875c0ea-3875-4131-bac4-1b6d90eff866"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db/messages
correlation: qa-2b0de433-fbad-4079-8cfd-f3faa33b5108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b0de433-fbad-4079-8cfd-f3faa33b5108
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b0de433-fbad-4079-8cfd-f3faa33b5108
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
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db/messages","correlationId":"qa-2b0de433-fbad-4079-8cfd-f3faa33b5108"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8b5b41c1-2195-4854-a3ee-9bd0a7d62085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b5b41c1-2195-4854-a3ee-9bd0a7d62085
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b5b41c1-2195-4854-a3ee-9bd0a7d62085
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

{"items":[{"id":"led_ac1bae41-60e5-442f-838d-0745d3e69909","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-19T10:29:20.804173331Z"},{"id":"led_bf1228a3-1cd6-4050-91a7-b247042614c0","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_7c6d13d0-b639-47ea-b0d6-1f4ec75a29db","createdAt":"2026-11-19T10:29:20.909535578Z"},{"id":"led_8162819f-8ced-4a12-986a-103cdd518d59","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_dfcf7183-e58a-4189-aa78-06e7c85e0076","createdAt":"2026-11-19T10:29:20.995349792Z"},{"id":"led_f6e042fa-20b1-4016-b657-c69f58bde0dd","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_3b7c07bc-bdef-46a8-b1b5-78280c761d1f","createdAt":"2026-11-19T10:29:21.033461029Z"},{"id":"led_c350d54b-1dcc-41b2-a43e-b1ffdb1322d4","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_ef7424bc-0654-4569-83db-71b4c9cab231","createdAt":"2026-11-19T10:29:21.051604553Z"},{"id":"led_c9e167e2-a11a-4bf6-90a3-ccbded50202e","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_2f636185-183f-4bc0-a0dc-41a59664b266","createdAt":"2026-11-19T10:29:21.068585667Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-c165e434-9bac-4ac9-9200-6ce68560d7a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c165e434-9bac-4ac9-9200-6ce68560d7a8
Content-Type: application/json

--- request body ---
{"handle":"qa-1e407613ac39","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-c165e434-9bac-4ac9-9200-6ce68560d7a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f11d139e-27ab-4c47-8ae3-a9b979808a82"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa42d923-b82f-4c84-91e9-8d402dbf8fe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa42d923-b82f-4c84-91e9-8d402dbf8fe3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa42d923-b82f-4c84-91e9-8d402dbf8fe3
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
correlation: qa-7de6ba08-9483-4bfd-b0e0-2a7328ef1bfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7de6ba08-9483-4bfd-b0e0-2a7328ef1bfa
Content-Type: application/json

--- request body ---
{"handle":"qa-1e407613ac39","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7de6ba08-9483-4bfd-b0e0-2a7328ef1bfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7de6ba08-9483-4bfd-b0e0-2a7328ef1bfa"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ff8737e-ad5d-4792-8fd6-a284a02e0fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff8737e-ad5d-4792-8fd6-a284a02e0fe4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ff8737e-ad5d-4792-8fd6-a284a02e0fe4
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
correlation: qa-35cbb015-fcf9-42db-93ad-5fa321837ffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35cbb015-fcf9-42db-93ad-5fa321837ffc
Content-Type: application/json

--- request body ---
{"handle":"qa-241c2e22aaee","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35cbb015-fcf9-42db-93ad-5fa321837ffc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35cbb015-fcf9-42db-93ad-5fa321837ffc"}
```
