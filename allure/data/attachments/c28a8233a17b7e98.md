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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-8ae01ac9-45a7-417f-af81-c71df3f71217` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-45a6de43-dbbe-4137-9c6d-2e8f1ed27a62` |
| 3 | `POST /v1/auth/token` | 200 | 67 | `qa-f8147a38-3ee8-4479-91c7-c7e04942a68c` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-a9036293-aed5-4b6e-adb7-04b064e2d501` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-3cd7b2f2-7dca-48a8-808a-73c27f3929f5` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-d98f490d-b4aa-415e-87bb-52188faecd1a` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-de654196-b7a3-4186-a0fc-cc039f0b36e7` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-a085c02f-4bee-4a28-b916-9d8620eb9de7` |
| 9 | `GET /v1/credits/balance` | 200 | 18 | `qa-761689ff-b073-469b-a84e-2a1f20bb35cd` |
| 10 | `POST /v1/conversations` | 402 | 9 | `qa-e16221ba-35da-430b-a910-efbf2bcec422` |
| 11 | `GET /v1/credits/ledger` | 200 | 5 | `qa-8fe7f4e5-cbf2-488c-8bd8-04b09146dd66` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-3179b57c-8f19-4228-83ea-55b0d145ef52` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e743b6b4-6a2f-48ea-ac21-d891b88eb79a` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-3517e91f-4f1b-4764-a5b5-f8054e0e867a` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-2b9920e0-ae91-49a4-bfa3-b4dc8ef625ee` |
| 16 | `POST /v1/auth/token` | 401 | 3 | `qa-3b87ff11-a6b1-4812-a1ef-952b5ecad782` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8ae01ac9-45a7-417f-af81-c71df3f71217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae01ac9-45a7-417f-af81-c71df3f71217
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca689221032","displayName":"QA 5ca689221032","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ae01ac9-45a7-417f-af81-c71df3f71217
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
Location: /v1/accounts/qa-5ca689221032
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47c35b32-6b2d-4adb-ab34-a9bf4a6ddaef","handle":"qa-5ca689221032","displayName":"QA 5ca689221032","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.058876304Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-45a6de43-dbbe-4137-9c6d-2e8f1ed27a62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a6de43-dbbe-4137-9c6d-2e8f1ed27a62
Content-Type: application/json

--- request body ---
{"handle":"qa-ea73f85ef4fc","displayName":"QA ea73f85ef4fc","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a6de43-dbbe-4137-9c6d-2e8f1ed27a62
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
Location: /v1/accounts/qa-ea73f85ef4fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9113b3-6656-46b6-a7c0-255b228bdd6b","handle":"qa-ea73f85ef4fc","displayName":"QA ea73f85ef4fc","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.103441089Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f8147a38-3ee8-4479-91c7-c7e04942a68c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8147a38-3ee8-4479-91c7-c7e04942a68c
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca689221032","password":"****"}

--- response: 200 in 67 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8147a38-3ee8-4479-91c7-c7e04942a68c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47c35b32-6b2d-4adb-ab34-a9bf4a6ddaef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a9036293-aed5-4b6e-adb7-04b064e2d501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9036293-aed5-4b6e-adb7-04b064e2d501
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ea73f85ef4fc","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9036293-aed5-4b6e-adb7-04b064e2d501
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
Location: /v1/conversations/cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ca689221032","qa-ea73f85ef4fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.213555921Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789/messages
correlation: qa-3cd7b2f2-7dca-48a8-808a-73c27f3929f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd7b2f2-7dca-48a8-808a-73c27f3929f5
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cd7b2f2-7dca-48a8-808a-73c27f3929f5
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

{"id":"msg_033779c4-40c9-43e7-9ed6-1b3261ba79d8","conversationId":"cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789","sender":"qa-5ca689221032","body":"2","createdAt":"2026-11-28T10:37:25.253875457Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789/messages
correlation: qa-d98f490d-b4aa-415e-87bb-52188faecd1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d98f490d-b4aa-415e-87bb-52188faecd1a
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d98f490d-b4aa-415e-87bb-52188faecd1a
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

{"id":"msg_04d9d8b5-d100-4072-abe8-4f9277fc6622","conversationId":"cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789","sender":"qa-5ca689221032","body":"3","createdAt":"2026-11-28T10:37:25.292855907Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789/messages
correlation: qa-de654196-b7a3-4186-a0fc-cc039f0b36e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de654196-b7a3-4186-a0fc-cc039f0b36e7
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-de654196-b7a3-4186-a0fc-cc039f0b36e7
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

{"id":"msg_4d1bff98-c720-4da8-b4f3-e879171926d3","conversationId":"cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789","sender":"qa-5ca689221032","body":"4","createdAt":"2026-11-28T10:37:25.326098929Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789/messages
correlation: qa-a085c02f-4bee-4a28-b916-9d8620eb9de7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a085c02f-4bee-4a28-b916-9d8620eb9de7
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a085c02f-4bee-4a28-b916-9d8620eb9de7
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

{"id":"msg_3ff47807-79db-49dc-ac09-f1d78b3f9a9a","conversationId":"cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789","sender":"qa-5ca689221032","body":"5","createdAt":"2026-11-28T10:37:25.356909465Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-761689ff-b073-469b-a84e-2a1f20bb35cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-761689ff-b073-469b-a84e-2a1f20bb35cd
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-761689ff-b073-469b-a84e-2a1f20bb35cd
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

{"balance":0,"currency":"credits","accountId":"acc_47c35b32-6b2d-4adb-ab34-a9bf4a6ddaef"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-e16221ba-35da-430b-a910-efbf2bcec422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e16221ba-35da-430b-a910-efbf2bcec422
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ea73f85ef4fc","subject":"One more","message":"Hi"}

--- response: 402 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e16221ba-35da-430b-a910-efbf2bcec422
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-e16221ba-35da-430b-a910-efbf2bcec422"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8fe7f4e5-cbf2-488c-8bd8-04b09146dd66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fe7f4e5-cbf2-488c-8bd8-04b09146dd66
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fe7f4e5-cbf2-488c-8bd8-04b09146dd66
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

{"items":[{"id":"led_a3002a3f-f11b-4a34-89c4-bf591327837c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:25.058885351Z"},{"id":"led_f06e0ad7-1269-42d0-83dc-1ff9a54d7654","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_8dbab6fd-7018-4b1b-b430-08ca9b882789","createdAt":"2026-11-28T10:37:25.213547736Z"},{"id":"led_8b1d99db-790d-4d46-9c76-d65e166f2f7c","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_033779c4-40c9-43e7-9ed6-1b3261ba79d8","createdAt":"2026-11-28T10:37:25.253857413Z"},{"id":"led_e3b10990-cb08-42cf-9d08-77dbc3908960","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_04d9d8b5-d100-4072-abe8-4f9277fc6622","createdAt":"2026-11-28T10:37:25.292845808Z"},{"id":"led_79c3e690-55e3-4513-9b42-d2bbbf15bf78","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_4d1bff98-c720-4da8-b4f3-e879171926d3","createdAt":"2026-11-28T10:37:25.326087208Z"},{"id":"led_639f6b7e-c84b-4a66-a30f-b596a3200447","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_3ff47807-79db-49dc-ac09-f1d78b3f9a9a","createdAt":"2026-11-28T10:37:25.356900308Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3179b57c-8f19-4228-83ea-55b0d145ef52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3179b57c-8f19-4228-83ea-55b0d145ef52
Content-Type: application/json

--- request body ---
{"handle":"qa-ea73f85ef4fc","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3179b57c-8f19-4228-83ea-55b0d145ef52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f9113b3-6656-46b6-a7c0-255b228bdd6b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e743b6b4-6a2f-48ea-ac21-d891b88eb79a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e743b6b4-6a2f-48ea-ac21-d891b88eb79a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e743b6b4-6a2f-48ea-ac21-d891b88eb79a
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
correlation: qa-3517e91f-4f1b-4764-a5b5-f8054e0e867a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3517e91f-4f1b-4764-a5b5-f8054e0e867a
Content-Type: application/json

--- request body ---
{"handle":"qa-ea73f85ef4fc","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3517e91f-4f1b-4764-a5b5-f8054e0e867a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3517e91f-4f1b-4764-a5b5-f8054e0e867a"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b9920e0-ae91-49a4-bfa3-b4dc8ef625ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9920e0-ae91-49a4-bfa3-b4dc8ef625ee
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b9920e0-ae91-49a4-bfa3-b4dc8ef625ee
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
correlation: qa-3b87ff11-a6b1-4812-a1ef-952b5ecad782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b87ff11-a6b1-4812-a1ef-952b5ecad782
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca689221032","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b87ff11-a6b1-4812-a1ef-952b5ecad782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b87ff11-a6b1-4812-a1ef-952b5ecad782"}
```
