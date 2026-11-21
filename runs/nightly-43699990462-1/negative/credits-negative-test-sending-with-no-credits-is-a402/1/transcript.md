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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-745b068c-b29a-421e-8396-b0041b500e38` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-a17daac8-dc67-4e2b-9289-90148ae75de2` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-96e63a2a-a50f-4705-9bc0-1858a7fec574` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-a54724a0-29b2-42ea-b672-1f4cb4f345ff` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-db3b1491-68af-49be-93f0-ea7cb7bdffb9` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-be75e5c9-5633-4def-979b-af46af9f44b1` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-46ba93e7-2639-4647-95ea-924f4b2f2a5e` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-a0e496ae-ae3b-4140-8e8c-d9cd3eef8bb1` |
| 9 | `GET /v1/credits/balance` | 200 | 6 | `qa-a1bd7e40-1dde-4a0b-b823-107a5e7d2bc0` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 8 | `qa-1a846e61-ac04-4047-9154-010be3ea976b` |
| 11 | `GET /v1/credits/ledger` | 200 | 27 | `qa-7add1711-8de4-4bd2-92d8-90ad677da3de` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-f6878c1d-fdfe-44ab-a41f-24e773d7fb55` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-1cdbfb03-d080-4c23-8062-39057b4d01ef` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-31d3db2e-cfd4-4e29-96b7-40aac7a00c1d` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-1eca204d-1a9d-4779-a339-2bd721e51d23` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-e7678b37-ea1b-4f2c-b092-ff5449683532` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-745b068c-b29a-421e-8396-b0041b500e38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745b068c-b29a-421e-8396-b0041b500e38
Content-Type: application/json

--- request body ---
{"handle":"qa-319b708cc9a6","displayName":"QA 319b708cc9a6","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-745b068c-b29a-421e-8396-b0041b500e38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-319b708cc9a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28b8a9ea-d923-4ba4-aa6e-c94aaf2dca1a","handle":"qa-319b708cc9a6","displayName":"QA 319b708cc9a6","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.935730392Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a17daac8-dc67-4e2b-9289-90148ae75de2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a17daac8-dc67-4e2b-9289-90148ae75de2
Content-Type: application/json

--- request body ---
{"handle":"qa-4045c240c50e","displayName":"QA 4045c240c50e","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a17daac8-dc67-4e2b-9289-90148ae75de2
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
Location: /v1/accounts/qa-4045c240c50e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a4df91f-f38b-43f6-8832-a21f77a6f87f","handle":"qa-4045c240c50e","displayName":"QA 4045c240c50e","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.962872470Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-96e63a2a-a50f-4705-9bc0-1858a7fec574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e63a2a-a50f-4705-9bc0-1858a7fec574
Content-Type: application/json

--- request body ---
{"handle":"qa-319b708cc9a6","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-96e63a2a-a50f-4705-9bc0-1858a7fec574
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28b8a9ea-d923-4ba4-aa6e-c94aaf2dca1a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a54724a0-29b2-42ea-b672-1f4cb4f345ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a54724a0-29b2-42ea-b672-1f4cb4f345ff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4045c240c50e","subject":"Many messages","message":"1"}

--- response: 201 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a54724a0-29b2-42ea-b672-1f4cb4f345ff
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
Location: /v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba","subject":"Many messages","status":"open","region":"eu","participants":["qa-319b708cc9a6","qa-4045c240c50e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:11.010068042Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba/messages
correlation: qa-db3b1491-68af-49be-93f0-ea7cb7bdffb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db3b1491-68af-49be-93f0-ea7cb7bdffb9
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-db3b1491-68af-49be-93f0-ea7cb7bdffb9
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

{"id":"msg_2af85e67-06ca-48fc-b543-cbed3adae92a","conversationId":"cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba","sender":"qa-319b708cc9a6","body":"2","createdAt":"2026-11-15T09:36:11.047359309Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba/messages
correlation: qa-be75e5c9-5633-4def-979b-af46af9f44b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be75e5c9-5633-4def-979b-af46af9f44b1
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-be75e5c9-5633-4def-979b-af46af9f44b1
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

{"id":"msg_b14872df-3d93-4ea9-b26a-463ce00f0050","conversationId":"cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba","sender":"qa-319b708cc9a6","body":"3","createdAt":"2026-11-15T09:36:11.065097909Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba/messages
correlation: qa-46ba93e7-2639-4647-95ea-924f4b2f2a5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46ba93e7-2639-4647-95ea-924f4b2f2a5e
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-46ba93e7-2639-4647-95ea-924f4b2f2a5e
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

{"id":"msg_5c720633-2555-4e25-ad68-f7e0979e9102","conversationId":"cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba","sender":"qa-319b708cc9a6","body":"4","createdAt":"2026-11-15T09:36:11.080959626Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba/messages
correlation: qa-a0e496ae-ae3b-4140-8e8c-d9cd3eef8bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e496ae-ae3b-4140-8e8c-d9cd3eef8bb1
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0e496ae-ae3b-4140-8e8c-d9cd3eef8bb1
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

{"id":"msg_ffa5ecc7-5f67-43f8-aa3f-373b04554cd9","conversationId":"cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba","sender":"qa-319b708cc9a6","body":"5","createdAt":"2026-11-15T09:36:11.099895243Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a1bd7e40-1dde-4a0b-b823-107a5e7d2bc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1bd7e40-1dde-4a0b-b823-107a5e7d2bc0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1bd7e40-1dde-4a0b-b823-107a5e7d2bc0
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

{"balance":0,"currency":"credits","accountId":"acc_28b8a9ea-d923-4ba4-aa6e-c94aaf2dca1a"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba/messages
correlation: qa-1a846e61-ac04-4047-9154-010be3ea976b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a846e61-ac04-4047-9154-010be3ea976b
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a846e61-ac04-4047-9154-010be3ea976b
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba/messages","correlationId":"qa-1a846e61-ac04-4047-9154-010be3ea976b"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7add1711-8de4-4bd2-92d8-90ad677da3de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7add1711-8de4-4bd2-92d8-90ad677da3de
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7add1711-8de4-4bd2-92d8-90ad677da3de
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

{"items":[{"id":"led_0a51de03-572c-4e9f-9ef2-4cbc6ac46ee2","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:10.935744203Z"},{"id":"led_a753fe90-fc05-4ca7-8368-e75d6c3a0a61","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5e1fafaa-c6d3-4701-8c4f-598b6faf10ba","createdAt":"2026-11-15T09:36:11.010052889Z"},{"id":"led_957c9d8e-dc84-41a4-85f4-548c3efb22d6","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_2af85e67-06ca-48fc-b543-cbed3adae92a","createdAt":"2026-11-15T09:36:11.047343847Z"},{"id":"led_97167197-d679-4f46-80e2-7862af6da043","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_b14872df-3d93-4ea9-b26a-463ce00f0050","createdAt":"2026-11-15T09:36:11.065070398Z"},{"id":"led_b2e7dc67-4e59-4ff1-966e-357a6185ace9","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_5c720633-2555-4e25-ad68-f7e0979e9102","createdAt":"2026-11-15T09:36:11.080931174Z"},{"id":"led_1784557e-9f02-4b00-9b92-1aa25e2ec87b","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_ffa5ecc7-5f67-43f8-aa3f-373b04554cd9","createdAt":"2026-11-15T09:36:11.099849786Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-f6878c1d-fdfe-44ab-a41f-24e773d7fb55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6878c1d-fdfe-44ab-a41f-24e773d7fb55
Content-Type: application/json

--- request body ---
{"handle":"qa-4045c240c50e","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6878c1d-fdfe-44ab-a41f-24e773d7fb55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a4df91f-f38b-43f6-8832-a21f77a6f87f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1cdbfb03-d080-4c23-8062-39057b4d01ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cdbfb03-d080-4c23-8062-39057b4d01ef
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1cdbfb03-d080-4c23-8062-39057b4d01ef
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
correlation: qa-31d3db2e-cfd4-4e29-96b7-40aac7a00c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31d3db2e-cfd4-4e29-96b7-40aac7a00c1d
Content-Type: application/json

--- request body ---
{"handle":"qa-4045c240c50e","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31d3db2e-cfd4-4e29-96b7-40aac7a00c1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31d3db2e-cfd4-4e29-96b7-40aac7a00c1d"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1eca204d-1a9d-4779-a339-2bd721e51d23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eca204d-1a9d-4779-a339-2bd721e51d23
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1eca204d-1a9d-4779-a339-2bd721e51d23
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
correlation: qa-e7678b37-ea1b-4f2c-b092-ff5449683532

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7678b37-ea1b-4f2c-b092-ff5449683532
Content-Type: application/json

--- request body ---
{"handle":"qa-319b708cc9a6","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7678b37-ea1b-4f2c-b092-ff5449683532
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7678b37-ea1b-4f2c-b092-ff5449683532"}
```
