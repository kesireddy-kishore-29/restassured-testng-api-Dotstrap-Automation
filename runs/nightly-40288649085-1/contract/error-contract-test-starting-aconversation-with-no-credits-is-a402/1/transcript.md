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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-b599beec-e856-4667-b276-d3624a58808c` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-d4a19991-8636-4b05-9234-8881681e2338` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-53d365a4-e4ef-4414-9a03-684ae7dad7d5` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-9809be6d-8356-4b90-9199-9fad12668f0c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-b0c853ad-45d0-4759-8a5d-819ecf6cc10f` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-206b3c4c-6b49-47ad-8ba7-ec85c88ba727` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-e9e90bab-a3bb-4464-8806-cce023c39eee` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-07dbb6dc-ea5c-4d2c-989b-2d14ccd08648` |
| 9 | `GET /v1/credits/balance` | 200 | 14 | `qa-07814180-e031-430f-aa46-ea4f93727213` |
| 10 | `POST /v1/conversations` | 402 | 15 | `qa-2f70d86c-a845-4516-8c92-8ab453fb06c8` |
| 11 | `GET /v1/credits/ledger` | 200 | 15 | `qa-b1743946-b216-4d91-8f9a-7ea59fc65190` |
| 12 | `POST /v1/auth/token` | 200 | 20 | `qa-fde5aa43-d7bb-4d54-b716-792549a4f43e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9212065c-34c8-4eed-a578-40903a3c5f78` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-92e48217-2a3f-4641-8a34-5f9506e81bc3` |
| 15 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-7fe1c7b2-2483-47b0-ae4a-a4693f76793a` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-0a5a6fcc-8d41-4812-bc9c-c0540e2c9b20` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b599beec-e856-4667-b276-d3624a58808c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b599beec-e856-4667-b276-d3624a58808c
Content-Type: application/json

--- request body ---
{"handle":"qa-ced931c2f734","displayName":"QA ced931c2f734","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b599beec-e856-4667-b276-d3624a58808c
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
Location: /v1/accounts/qa-ced931c2f734
X-Served-Region: eu
Content-Length: 181

{"id":"acc_555c112f-273d-4e17-aa84-00252993bdf4","handle":"qa-ced931c2f734","displayName":"QA ced931c2f734","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.224647821Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d4a19991-8636-4b05-9234-8881681e2338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4a19991-8636-4b05-9234-8881681e2338
Content-Type: application/json

--- request body ---
{"handle":"qa-2142e6fe93a7","displayName":"QA 2142e6fe93a7","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4a19991-8636-4b05-9234-8881681e2338
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
Location: /v1/accounts/qa-2142e6fe93a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e21cff5-0a53-4c07-ba44-fa459f3a1983","handle":"qa-2142e6fe93a7","displayName":"QA 2142e6fe93a7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.261651588Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-53d365a4-e4ef-4414-9a03-684ae7dad7d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d365a4-e4ef-4414-9a03-684ae7dad7d5
Content-Type: application/json

--- request body ---
{"handle":"qa-ced931c2f734","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d365a4-e4ef-4414-9a03-684ae7dad7d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_555c112f-273d-4e17-aa84-00252993bdf4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9809be6d-8356-4b90-9199-9fad12668f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9809be6d-8356-4b90-9199-9fad12668f0c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2142e6fe93a7","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9809be6d-8356-4b90-9199-9fad12668f0c
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
Location: /v1/conversations/cnv_a475ab70-373f-46f3-a658-906c8fc629a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a475ab70-373f-46f3-a658-906c8fc629a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-ced931c2f734","qa-2142e6fe93a7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.348010965Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a475ab70-373f-46f3-a658-906c8fc629a7/messages
correlation: qa-b0c853ad-45d0-4759-8a5d-819ecf6cc10f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c853ad-45d0-4759-8a5d-819ecf6cc10f
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0c853ad-45d0-4759-8a5d-819ecf6cc10f
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

{"id":"msg_89406f4d-aa5b-4a04-915a-e89613a36457","conversationId":"cnv_a475ab70-373f-46f3-a658-906c8fc629a7","sender":"qa-ced931c2f734","body":"2","createdAt":"2026-10-26T07:54:48.383030896Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_a475ab70-373f-46f3-a658-906c8fc629a7/messages
correlation: qa-206b3c4c-6b49-47ad-8ba7-ec85c88ba727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-206b3c4c-6b49-47ad-8ba7-ec85c88ba727
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-206b3c4c-6b49-47ad-8ba7-ec85c88ba727
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

{"id":"msg_4394ed36-875f-4d0b-b8a7-6472bd7e798b","conversationId":"cnv_a475ab70-373f-46f3-a658-906c8fc629a7","sender":"qa-ced931c2f734","body":"3","createdAt":"2026-10-26T07:54:48.414772686Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a475ab70-373f-46f3-a658-906c8fc629a7/messages
correlation: qa-e9e90bab-a3bb-4464-8806-cce023c39eee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9e90bab-a3bb-4464-8806-cce023c39eee
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9e90bab-a3bb-4464-8806-cce023c39eee
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

{"id":"msg_658b02f8-7b24-4957-8aea-cbc2e6d1fa4b","conversationId":"cnv_a475ab70-373f-46f3-a658-906c8fc629a7","sender":"qa-ced931c2f734","body":"4","createdAt":"2026-10-26T07:54:48.431040389Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_a475ab70-373f-46f3-a658-906c8fc629a7/messages
correlation: qa-07dbb6dc-ea5c-4d2c-989b-2d14ccd08648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07dbb6dc-ea5c-4d2c-989b-2d14ccd08648
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-07dbb6dc-ea5c-4d2c-989b-2d14ccd08648
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

{"id":"msg_40d894ff-e7f5-4f26-a786-8ac0b863e4c1","conversationId":"cnv_a475ab70-373f-46f3-a658-906c8fc629a7","sender":"qa-ced931c2f734","body":"5","createdAt":"2026-10-26T07:54:48.456735094Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-07814180-e031-430f-aa46-ea4f93727213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07814180-e031-430f-aa46-ea4f93727213
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-07814180-e031-430f-aa46-ea4f93727213
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

{"balance":0,"currency":"credits","accountId":"acc_555c112f-273d-4e17-aa84-00252993bdf4"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-2f70d86c-a845-4516-8c92-8ab453fb06c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f70d86c-a845-4516-8c92-8ab453fb06c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2142e6fe93a7","subject":"One more","message":"Hi"}

--- response: 402 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f70d86c-a845-4516-8c92-8ab453fb06c8
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-2f70d86c-a845-4516-8c92-8ab453fb06c8"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b1743946-b216-4d91-8f9a-7ea59fc65190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1743946-b216-4d91-8f9a-7ea59fc65190
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1743946-b216-4d91-8f9a-7ea59fc65190
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

{"items":[{"id":"led_1760953c-254b-48ae-b889-cb16c4a14c89","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-26T07:54:48.224658136Z"},{"id":"led_9dd00003-0b8b-48af-94d6-d57c15917c44","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_a475ab70-373f-46f3-a658-906c8fc629a7","createdAt":"2026-10-26T07:54:48.348001030Z"},{"id":"led_dde74bb4-e61b-4618-bd29-6d13ec0ea713","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_89406f4d-aa5b-4a04-915a-e89613a36457","createdAt":"2026-10-26T07:54:48.383023065Z"},{"id":"led_d42790b7-9d35-4237-9151-99efc3d18071","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_4394ed36-875f-4d0b-b8a7-6472bd7e798b","createdAt":"2026-10-26T07:54:48.414765225Z"},{"id":"led_1518a8a3-4394-489f-90ac-12c99c2583fe","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_658b02f8-7b24-4957-8aea-cbc2e6d1fa4b","createdAt":"2026-10-26T07:54:48.431035072Z"},{"id":"led_dff2bc38-2675-461c-8802-3190a953ac7c","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_40d894ff-e7f5-4f26-a786-8ac0b863e4c1","createdAt":"2026-10-26T07:54:48.456728044Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-fde5aa43-d7bb-4d54-b716-792549a4f43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fde5aa43-d7bb-4d54-b716-792549a4f43e
Content-Type: application/json

--- request body ---
{"handle":"qa-2142e6fe93a7","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-fde5aa43-d7bb-4d54-b716-792549a4f43e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e21cff5-0a53-4c07-ba44-fa459f3a1983"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9212065c-34c8-4eed-a578-40903a3c5f78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9212065c-34c8-4eed-a578-40903a3c5f78
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9212065c-34c8-4eed-a578-40903a3c5f78
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
correlation: qa-92e48217-2a3f-4641-8a34-5f9506e81bc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e48217-2a3f-4641-8a34-5f9506e81bc3
Content-Type: application/json

--- request body ---
{"handle":"qa-2142e6fe93a7","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92e48217-2a3f-4641-8a34-5f9506e81bc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92e48217-2a3f-4641-8a34-5f9506e81bc3"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fe1c7b2-2483-47b0-ae4a-a4693f76793a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fe1c7b2-2483-47b0-ae4a-a4693f76793a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fe1c7b2-2483-47b0-ae4a-a4693f76793a
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
correlation: qa-0a5a6fcc-8d41-4812-bc9c-c0540e2c9b20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a5a6fcc-8d41-4812-bc9c-c0540e2c9b20
Content-Type: application/json

--- request body ---
{"handle":"qa-ced931c2f734","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a5a6fcc-8d41-4812-bc9c-c0540e2c9b20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a5a6fcc-8d41-4812-bc9c-c0540e2c9b20"}
```
