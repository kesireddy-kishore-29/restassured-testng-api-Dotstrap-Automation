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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-13b20172-0639-4a27-a0aa-2592fbede00f` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-3694e17c-fb8c-464e-b06d-79e24863177f` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-902c0357-4d63-4c3a-aaa5-c9d81d51063e` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-2fa20252-de19-4aea-92f4-43faeef132b2` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-b1eae80c-99a2-4884-b696-08120d36f596` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-f309c105-c982-44b1-a8b9-9f634927460c` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-84a61ee3-4db0-42c7-aa76-dbd67352c363` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-ac2ad048-722c-4bdf-9cac-38689a7359fe` |
| 9 | `GET /v1/credits/balance` | 200 | 6 | `qa-a63fd218-27a7-406d-857a-2bb31748b417` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 6 | `qa-fe990225-c532-4e5f-8932-b0b79c0ab7e5` |
| 11 | `GET /v1/credits/ledger` | 200 | 16 | `qa-cfd3742e-e9b9-4e50-a327-6cfbfab0cfa8` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-b52124cc-fede-4c91-9a9d-412b3348c932` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-2c2ea826-9a82-492b-a012-86ba4617034a` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-b281eb7d-ccf9-4160-9446-90a7798178b2` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-69b1fb7b-d345-4b68-9962-7f115771f09c` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-a5cc2681-b116-4315-9142-362f72684ed9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-13b20172-0639-4a27-a0aa-2592fbede00f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b20172-0639-4a27-a0aa-2592fbede00f
Content-Type: application/json

--- request body ---
{"handle":"qa-ebf7ceac964e","displayName":"QA ebf7ceac964e","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-13b20172-0639-4a27-a0aa-2592fbede00f
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
Location: /v1/accounts/qa-ebf7ceac964e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_debec6b2-c6ba-40b7-81e3-e4815f822e9f","handle":"qa-ebf7ceac964e","displayName":"QA ebf7ceac964e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.444654570Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3694e17c-fb8c-464e-b06d-79e24863177f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3694e17c-fb8c-464e-b06d-79e24863177f
Content-Type: application/json

--- request body ---
{"handle":"qa-e68fb354bbc7","displayName":"QA e68fb354bbc7","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3694e17c-fb8c-464e-b06d-79e24863177f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-e68fb354bbc7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_839071e1-1480-42eb-afa7-c020a497012f","handle":"qa-e68fb354bbc7","displayName":"QA e68fb354bbc7","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.478598777Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-902c0357-4d63-4c3a-aaa5-c9d81d51063e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-902c0357-4d63-4c3a-aaa5-c9d81d51063e
Content-Type: application/json

--- request body ---
{"handle":"qa-ebf7ceac964e","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-902c0357-4d63-4c3a-aaa5-c9d81d51063e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_debec6b2-c6ba-40b7-81e3-e4815f822e9f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2fa20252-de19-4aea-92f4-43faeef132b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa20252-de19-4aea-92f4-43faeef132b2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e68fb354bbc7","subject":"Many messages","message":"1"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa20252-de19-4aea-92f4-43faeef132b2
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
Location: /v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164","subject":"Many messages","status":"open","region":"eu","participants":["qa-ebf7ceac964e","qa-e68fb354bbc7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:10.555886428Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164/messages
correlation: qa-b1eae80c-99a2-4884-b696-08120d36f596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1eae80c-99a2-4884-b696-08120d36f596
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1eae80c-99a2-4884-b696-08120d36f596
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

{"id":"msg_bd95030b-615e-4024-8887-39f2b9633ee0","conversationId":"cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164","sender":"qa-ebf7ceac964e","body":"2","createdAt":"2026-11-13T09:42:10.604159315Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164/messages
correlation: qa-f309c105-c982-44b1-a8b9-9f634927460c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f309c105-c982-44b1-a8b9-9f634927460c
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f309c105-c982-44b1-a8b9-9f634927460c
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

{"id":"msg_ba02eff5-ad18-499b-baeb-ce3d91aa2ab2","conversationId":"cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164","sender":"qa-ebf7ceac964e","body":"3","createdAt":"2026-11-13T09:42:10.644342396Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164/messages
correlation: qa-84a61ee3-4db0-42c7-aa76-dbd67352c363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84a61ee3-4db0-42c7-aa76-dbd67352c363
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-84a61ee3-4db0-42c7-aa76-dbd67352c363
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

{"id":"msg_5fa86f2f-db39-4dcf-a991-536cfcea6780","conversationId":"cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164","sender":"qa-ebf7ceac964e","body":"4","createdAt":"2026-11-13T09:42:10.691321545Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164/messages
correlation: qa-ac2ad048-722c-4bdf-9cac-38689a7359fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac2ad048-722c-4bdf-9cac-38689a7359fe
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac2ad048-722c-4bdf-9cac-38689a7359fe
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

{"id":"msg_ce2e83bd-0957-436c-95f8-973e0fe29dd0","conversationId":"cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164","sender":"qa-ebf7ceac964e","body":"5","createdAt":"2026-11-13T09:42:10.720686999Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a63fd218-27a7-406d-857a-2bb31748b417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a63fd218-27a7-406d-857a-2bb31748b417
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a63fd218-27a7-406d-857a-2bb31748b417
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

{"balance":0,"currency":"credits","accountId":"acc_debec6b2-c6ba-40b7-81e3-e4815f822e9f"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164/messages
correlation: qa-fe990225-c532-4e5f-8932-b0b79c0ab7e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe990225-c532-4e5f-8932-b0b79c0ab7e5
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe990225-c532-4e5f-8932-b0b79c0ab7e5
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164/messages","correlationId":"qa-fe990225-c532-4e5f-8932-b0b79c0ab7e5"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cfd3742e-e9b9-4e50-a327-6cfbfab0cfa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfd3742e-e9b9-4e50-a327-6cfbfab0cfa8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfd3742e-e9b9-4e50-a327-6cfbfab0cfa8
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

{"items":[{"id":"led_2775d59c-55ce-43b6-8a0d-39d0811a59c5","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:10.444669769Z"},{"id":"led_e482a1c8-2c58-42be-8cd3-59138236a4c5","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b12ee2ee-6aa9-4c18-8677-05e46e20b164","createdAt":"2026-11-13T09:42:10.555845852Z"},{"id":"led_e046cd27-be39-47b3-8675-64e2ca4d8e1b","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_bd95030b-615e-4024-8887-39f2b9633ee0","createdAt":"2026-11-13T09:42:10.604139007Z"},{"id":"led_1977f89b-83c8-49b9-af38-7da2422a0804","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_ba02eff5-ad18-499b-baeb-ce3d91aa2ab2","createdAt":"2026-11-13T09:42:10.644306589Z"},{"id":"led_a6b2b21d-236f-47fc-8ece-98e6a6a1883e","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_5fa86f2f-db39-4dcf-a991-536cfcea6780","createdAt":"2026-11-13T09:42:10.691281641Z"},{"id":"led_0339a7ab-bc92-4983-988d-10ba6ce4f0c1","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_ce2e83bd-0957-436c-95f8-973e0fe29dd0","createdAt":"2026-11-13T09:42:10.720638849Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b52124cc-fede-4c91-9a9d-412b3348c932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b52124cc-fede-4c91-9a9d-412b3348c932
Content-Type: application/json

--- request body ---
{"handle":"qa-e68fb354bbc7","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b52124cc-fede-4c91-9a9d-412b3348c932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_839071e1-1480-42eb-afa7-c020a497012f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c2ea826-9a82-492b-a012-86ba4617034a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2ea826-9a82-492b-a012-86ba4617034a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c2ea826-9a82-492b-a012-86ba4617034a
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
correlation: qa-b281eb7d-ccf9-4160-9446-90a7798178b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b281eb7d-ccf9-4160-9446-90a7798178b2
Content-Type: application/json

--- request body ---
{"handle":"qa-e68fb354bbc7","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b281eb7d-ccf9-4160-9446-90a7798178b2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b281eb7d-ccf9-4160-9446-90a7798178b2"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69b1fb7b-d345-4b68-9962-7f115771f09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69b1fb7b-d345-4b68-9962-7f115771f09c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69b1fb7b-d345-4b68-9962-7f115771f09c
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
correlation: qa-a5cc2681-b116-4315-9142-362f72684ed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5cc2681-b116-4315-9142-362f72684ed9
Content-Type: application/json

--- request body ---
{"handle":"qa-ebf7ceac964e","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5cc2681-b116-4315-9142-362f72684ed9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5cc2681-b116-4315-9142-362f72684ed9"}
```
