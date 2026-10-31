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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-e02e7bda-fc0f-421b-b87a-8c652b161479` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-a56ab975-489e-4992-8779-2769d53caccb` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-57776be1-5180-4d3e-9de1-55c5e14733e6` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-352908c1-9ec5-47d4-8a12-21c61bc65976` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-9e9d3d19-ae20-4e6c-8b3a-e16580c4c9b5` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-26e8dadf-5eb4-4426-9fe4-e708e4c77e82` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 34 | `qa-b807ef63-ed23-4183-862f-136b3c171c10` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-ee49610b-2988-48b5-96c7-8a658c87d58f` |
| 9 | `GET /v1/credits/balance` | 200 | 7 | `qa-9cc8c839-5c4a-4d23-9f25-79f30da0ee52` |
| 10 | `POST /v1/conversations` | 402 | 12 | `qa-87498e7f-00f3-47c7-9b25-20427c38436f` |
| 11 | `GET /v1/credits/ledger` | 200 | 3 | `qa-bc590a25-b30d-4490-8615-a84e61d9be3b` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-6730764d-e5a9-41ef-9373-56801261daa7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-26081d92-0369-4403-b92f-407843624fca` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-cdde7719-a66a-48e0-bf96-c0691c62d4f9` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5fa0185b-1275-4c37-957e-b3396c2f0f34` |
| 16 | `POST /v1/auth/token` | 401 | 4 | `qa-593aaf52-ddca-4b0f-84a8-e3d26afacbfd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e02e7bda-fc0f-421b-b87a-8c652b161479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e02e7bda-fc0f-421b-b87a-8c652b161479
Content-Type: application/json

--- request body ---
{"handle":"qa-6d865002e7fc","displayName":"QA 6d865002e7fc","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e02e7bda-fc0f-421b-b87a-8c652b161479
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
Location: /v1/accounts/qa-6d865002e7fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a29d97a1-fbd8-4aa8-8f61-0337d342ccba","handle":"qa-6d865002e7fc","displayName":"QA 6d865002e7fc","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.422740377Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a56ab975-489e-4992-8779-2769d53caccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a56ab975-489e-4992-8779-2769d53caccb
Content-Type: application/json

--- request body ---
{"handle":"qa-b034ccfc7b7a","displayName":"QA b034ccfc7b7a","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a56ab975-489e-4992-8779-2769d53caccb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Location: /v1/accounts/qa-b034ccfc7b7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27254ab5-23cc-456e-a743-506041675ef6","handle":"qa-b034ccfc7b7a","displayName":"QA b034ccfc7b7a","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.460026729Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57776be1-5180-4d3e-9de1-55c5e14733e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57776be1-5180-4d3e-9de1-55c5e14733e6
Content-Type: application/json

--- request body ---
{"handle":"qa-6d865002e7fc","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-57776be1-5180-4d3e-9de1-55c5e14733e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a29d97a1-fbd8-4aa8-8f61-0337d342ccba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-352908c1-9ec5-47d4-8a12-21c61bc65976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352908c1-9ec5-47d4-8a12-21c61bc65976
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b034ccfc7b7a","subject":"Error contract","message":"Hi"}

--- response: 201 in 48 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-352908c1-9ec5-47d4-8a12-21c61bc65976
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
Location: /v1/conversations/cnv_eed482fa-b5fe-473c-a086-96ba76686bd9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eed482fa-b5fe-473c-a086-96ba76686bd9","subject":"Error contract","status":"open","region":"eu","participants":["qa-6d865002e7fc","qa-b034ccfc7b7a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.539902186Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_eed482fa-b5fe-473c-a086-96ba76686bd9/messages
correlation: qa-9e9d3d19-ae20-4e6c-8b3a-e16580c4c9b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e9d3d19-ae20-4e6c-8b3a-e16580c4c9b5
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e9d3d19-ae20-4e6c-8b3a-e16580c4c9b5
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

{"id":"msg_34a8ff56-d0da-41df-a8cb-dbf0cbd218ed","conversationId":"cnv_eed482fa-b5fe-473c-a086-96ba76686bd9","sender":"qa-6d865002e7fc","body":"2","createdAt":"2026-10-24T07:25:03.563110314Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_eed482fa-b5fe-473c-a086-96ba76686bd9/messages
correlation: qa-26e8dadf-5eb4-4426-9fe4-e708e4c77e82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26e8dadf-5eb4-4426-9fe4-e708e4c77e82
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-26e8dadf-5eb4-4426-9fe4-e708e4c77e82
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

{"id":"msg_e11ec40d-0307-46c1-8731-cd9356694a97","conversationId":"cnv_eed482fa-b5fe-473c-a086-96ba76686bd9","sender":"qa-6d865002e7fc","body":"3","createdAt":"2026-10-24T07:25:03.585396932Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_eed482fa-b5fe-473c-a086-96ba76686bd9/messages
correlation: qa-b807ef63-ed23-4183-862f-136b3c171c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b807ef63-ed23-4183-862f-136b3c171c10
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b807ef63-ed23-4183-862f-136b3c171c10
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

{"id":"msg_3ed1f1e8-255b-447e-9b77-a96e0dbd5e91","conversationId":"cnv_eed482fa-b5fe-473c-a086-96ba76686bd9","sender":"qa-6d865002e7fc","body":"4","createdAt":"2026-10-24T07:25:03.627014073Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_eed482fa-b5fe-473c-a086-96ba76686bd9/messages
correlation: qa-ee49610b-2988-48b5-96c7-8a658c87d58f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee49610b-2988-48b5-96c7-8a658c87d58f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee49610b-2988-48b5-96c7-8a658c87d58f
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

{"id":"msg_8e2123f1-f037-46dc-ae99-fb0f7168e32a","conversationId":"cnv_eed482fa-b5fe-473c-a086-96ba76686bd9","sender":"qa-6d865002e7fc","body":"5","createdAt":"2026-10-24T07:25:03.638949941Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-9cc8c839-5c4a-4d23-9f25-79f30da0ee52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc8c839-5c4a-4d23-9f25-79f30da0ee52
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cc8c839-5c4a-4d23-9f25-79f30da0ee52
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

{"balance":0,"currency":"credits","accountId":"acc_a29d97a1-fbd8-4aa8-8f61-0337d342ccba"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-87498e7f-00f3-47c7-9b25-20427c38436f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87498e7f-00f3-47c7-9b25-20427c38436f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b034ccfc7b7a","subject":"One more","message":"Hi"}

--- response: 402 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87498e7f-00f3-47c7-9b25-20427c38436f
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-87498e7f-00f3-47c7-9b25-20427c38436f"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bc590a25-b30d-4490-8615-a84e61d9be3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc590a25-b30d-4490-8615-a84e61d9be3b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc590a25-b30d-4490-8615-a84e61d9be3b
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

{"items":[{"id":"led_690d4352-aa8c-427f-badd-50c567829d96","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-24T07:25:03.422751684Z"},{"id":"led_3986ebe9-b4a0-4e3b-bffa-629439b401a8","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_eed482fa-b5fe-473c-a086-96ba76686bd9","createdAt":"2026-10-24T07:25:03.539884350Z"},{"id":"led_8894e10f-fd8d-4b74-8959-a329f645a418","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_34a8ff56-d0da-41df-a8cb-dbf0cbd218ed","createdAt":"2026-10-24T07:25:03.563103834Z"},{"id":"led_dbad863b-be37-4408-8133-c01dc7d5d256","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_e11ec40d-0307-46c1-8731-cd9356694a97","createdAt":"2026-10-24T07:25:03.585388660Z"},{"id":"led_27745e5b-cb3d-447c-bbfc-6bc54c8f8f72","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_3ed1f1e8-255b-447e-9b77-a96e0dbd5e91","createdAt":"2026-10-24T07:25:03.626991209Z"},{"id":"led_9a37261c-87a6-4ebf-ad81-41b9ae2a5813","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_8e2123f1-f037-46dc-ae99-fb0f7168e32a","createdAt":"2026-10-24T07:25:03.638944033Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-6730764d-e5a9-41ef-9373-56801261daa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6730764d-e5a9-41ef-9373-56801261daa7
Content-Type: application/json

--- request body ---
{"handle":"qa-b034ccfc7b7a","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6730764d-e5a9-41ef-9373-56801261daa7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27254ab5-23cc-456e-a743-506041675ef6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26081d92-0369-4403-b92f-407843624fca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26081d92-0369-4403-b92f-407843624fca
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26081d92-0369-4403-b92f-407843624fca
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
correlation: qa-cdde7719-a66a-48e0-bf96-c0691c62d4f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdde7719-a66a-48e0-bf96-c0691c62d4f9
Content-Type: application/json

--- request body ---
{"handle":"qa-b034ccfc7b7a","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdde7719-a66a-48e0-bf96-c0691c62d4f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cdde7719-a66a-48e0-bf96-c0691c62d4f9"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fa0185b-1275-4c37-957e-b3396c2f0f34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fa0185b-1275-4c37-957e-b3396c2f0f34
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fa0185b-1275-4c37-957e-b3396c2f0f34
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
correlation: qa-593aaf52-ddca-4b0f-84a8-e3d26afacbfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-593aaf52-ddca-4b0f-84a8-e3d26afacbfd
Content-Type: application/json

--- request body ---
{"handle":"qa-6d865002e7fc","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-593aaf52-ddca-4b0f-84a8-e3d26afacbfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-593aaf52-ddca-4b0f-84a8-e3d26afacbfd"}
```
