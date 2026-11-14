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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-897190b6-29b1-4f8d-9003-2ef1878d5ed1` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-5b9916e5-e3f3-433e-aeae-f35c08e19e16` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-b5592efd-9d02-42d3-8d3a-9e4bdc69d7b9` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-ea68878f-6365-4ce7-9d9c-04ee7dc43e50` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-2f76aaf6-4a76-48ea-95cb-106e8c84dae3` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-027166ca-1ad7-428c-a8c9-ce5674e15542` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-e235d0cd-5801-4d38-bd7f-dfd87c3a2770` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-1ea9fc17-285a-4bc3-9b52-cb4c110b026b` |
| 9 | `GET /v1/credits/balance` | 200 | 16 | `qa-946d0c8a-3fb6-4931-80b3-38a7384798c2` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 26 | `qa-041cb928-eaa0-4ec1-be11-0448897044a2` |
| 11 | `GET /v1/credits/ledger` | 200 | 20 | `qa-3bfb3859-f4b3-4beb-9fd8-0375b582f8d8` |
| 12 | `POST /v1/auth/token` | 200 | 16 | `qa-b746d3c4-f09d-4bc1-9a76-256a2b6e1efb` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-eb7fd5dd-a2d9-48a8-bc78-a78e51211843` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-f639d437-2e1f-4ee7-a245-14abf81442d6` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-15d2f621-8261-44ba-853f-ce127a8727db` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-d4d3ee75-988b-484b-b217-7f77247cf679` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-897190b6-29b1-4f8d-9003-2ef1878d5ed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897190b6-29b1-4f8d-9003-2ef1878d5ed1
Content-Type: application/json

--- request body ---
{"handle":"qa-60d9d1a8db30","displayName":"QA 60d9d1a8db30","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-897190b6-29b1-4f8d-9003-2ef1878d5ed1
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
Location: /v1/accounts/qa-60d9d1a8db30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10091023-2726-4005-a3ee-8c34b99292ae","handle":"qa-60d9d1a8db30","displayName":"QA 60d9d1a8db30","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.806751302Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5b9916e5-e3f3-433e-aeae-f35c08e19e16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9916e5-e3f3-433e-aeae-f35c08e19e16
Content-Type: application/json

--- request body ---
{"handle":"qa-64f6065a289b","displayName":"QA 64f6065a289b","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b9916e5-e3f3-433e-aeae-f35c08e19e16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 8
Location: /v1/accounts/qa-64f6065a289b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c37f891-35ab-416e-a41f-5dab130d664a","handle":"qa-64f6065a289b","displayName":"QA 64f6065a289b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.833423194Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5592efd-9d02-42d3-8d3a-9e4bdc69d7b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5592efd-9d02-42d3-8d3a-9e4bdc69d7b9
Content-Type: application/json

--- request body ---
{"handle":"qa-60d9d1a8db30","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5592efd-9d02-42d3-8d3a-9e4bdc69d7b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10091023-2726-4005-a3ee-8c34b99292ae"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ea68878f-6365-4ce7-9d9c-04ee7dc43e50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea68878f-6365-4ce7-9d9c-04ee7dc43e50
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-64f6065a289b","subject":"Many messages","message":"1"}

--- response: 201 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea68878f-6365-4ce7-9d9c-04ee7dc43e50
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
Location: /v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce","subject":"Many messages","status":"open","region":"eu","participants":["qa-60d9d1a8db30","qa-64f6065a289b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:47.901997582Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce/messages
correlation: qa-2f76aaf6-4a76-48ea-95cb-106e8c84dae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f76aaf6-4a76-48ea-95cb-106e8c84dae3
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f76aaf6-4a76-48ea-95cb-106e8c84dae3
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

{"id":"msg_6120bbfa-d0e1-466c-85dd-7e12cf72725b","conversationId":"cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce","sender":"qa-60d9d1a8db30","body":"2","createdAt":"2026-11-10T09:59:47.952488816Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce/messages
correlation: qa-027166ca-1ad7-428c-a8c9-ce5674e15542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-027166ca-1ad7-428c-a8c9-ce5674e15542
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-027166ca-1ad7-428c-a8c9-ce5674e15542
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

{"id":"msg_8aadd264-d208-4d2a-b236-2ea6b046304e","conversationId":"cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce","sender":"qa-60d9d1a8db30","body":"3","createdAt":"2026-11-10T09:59:47.995936674Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce/messages
correlation: qa-e235d0cd-5801-4d38-bd7f-dfd87c3a2770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e235d0cd-5801-4d38-bd7f-dfd87c3a2770
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e235d0cd-5801-4d38-bd7f-dfd87c3a2770
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

{"id":"msg_a2305854-6ee0-4beb-b8d9-b67294ee5ae2","conversationId":"cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce","sender":"qa-60d9d1a8db30","body":"4","createdAt":"2026-11-10T09:59:48.030755402Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce/messages
correlation: qa-1ea9fc17-285a-4bc3-9b52-cb4c110b026b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea9fc17-285a-4bc3-9b52-cb4c110b026b
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ea9fc17-285a-4bc3-9b52-cb4c110b026b
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

{"id":"msg_fcbf570a-ad88-4aa0-913a-bc530a3d261c","conversationId":"cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce","sender":"qa-60d9d1a8db30","body":"5","createdAt":"2026-11-10T09:59:48.077840128Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-946d0c8a-3fb6-4931-80b3-38a7384798c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-946d0c8a-3fb6-4931-80b3-38a7384798c2
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-946d0c8a-3fb6-4931-80b3-38a7384798c2
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

{"balance":0,"currency":"credits","accountId":"acc_10091023-2726-4005-a3ee-8c34b99292ae"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce/messages
correlation: qa-041cb928-eaa0-4ec1-be11-0448897044a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-041cb928-eaa0-4ec1-be11-0448897044a2
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-041cb928-eaa0-4ec1-be11-0448897044a2
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce/messages","correlationId":"qa-041cb928-eaa0-4ec1-be11-0448897044a2"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3bfb3859-f4b3-4beb-9fd8-0375b582f8d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bfb3859-f4b3-4beb-9fd8-0375b582f8d8
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bfb3859-f4b3-4beb-9fd8-0375b582f8d8
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

{"items":[{"id":"led_8612876d-29af-4a60-8b93-cc9befa8da42","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-10T09:59:47.806769626Z"},{"id":"led_5a59e72d-818f-46fc-9faf-9a1369ac505d","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_233a0bf3-0fab-4fbe-92a9-0c37e12b6dce","createdAt":"2026-11-10T09:59:47.901978807Z"},{"id":"led_8e3b6787-d2d3-432b-9cd9-a881f5d1ba37","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_6120bbfa-d0e1-466c-85dd-7e12cf72725b","createdAt":"2026-11-10T09:59:47.952468749Z"},{"id":"led_42fe6219-9cc9-4f74-82ee-85e4379c176d","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_8aadd264-d208-4d2a-b236-2ea6b046304e","createdAt":"2026-11-10T09:59:47.995902982Z"},{"id":"led_293ecc66-de8c-4c89-ba64-8d67e6e29476","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_a2305854-6ee0-4beb-b8d9-b67294ee5ae2","createdAt":"2026-11-10T09:59:48.030696332Z"},{"id":"led_dcb92538-b084-47c1-ade4-1e015823bea5","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_fcbf570a-ad88-4aa0-913a-bc530a3d261c","createdAt":"2026-11-10T09:59:48.077790856Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b746d3c4-f09d-4bc1-9a76-256a2b6e1efb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b746d3c4-f09d-4bc1-9a76-256a2b6e1efb
Content-Type: application/json

--- request body ---
{"handle":"qa-64f6065a289b","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b746d3c4-f09d-4bc1-9a76-256a2b6e1efb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c37f891-35ab-416e-a41f-5dab130d664a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb7fd5dd-a2d9-48a8-bc78-a78e51211843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7fd5dd-a2d9-48a8-bc78-a78e51211843
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb7fd5dd-a2d9-48a8-bc78-a78e51211843
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
correlation: qa-f639d437-2e1f-4ee7-a245-14abf81442d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f639d437-2e1f-4ee7-a245-14abf81442d6
Content-Type: application/json

--- request body ---
{"handle":"qa-64f6065a289b","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f639d437-2e1f-4ee7-a245-14abf81442d6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f639d437-2e1f-4ee7-a245-14abf81442d6"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15d2f621-8261-44ba-853f-ce127a8727db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15d2f621-8261-44ba-853f-ce127a8727db
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15d2f621-8261-44ba-853f-ce127a8727db
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
correlation: qa-d4d3ee75-988b-484b-b217-7f77247cf679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d3ee75-988b-484b-b217-7f77247cf679
Content-Type: application/json

--- request body ---
{"handle":"qa-60d9d1a8db30","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4d3ee75-988b-484b-b217-7f77247cf679
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4d3ee75-988b-484b-b217-7f77247cf679"}
```
