# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-75560721-90af-4df6-b550-490773c613dc` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-32ffab2c-0735-40c5-8213-668357d930a5` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-00b2f728-a361-4930-a4a3-8f70bfe8b250` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-bbea5e05-bc65-41f0-965d-c6e7ad2ff3b3` |
| 5 | `GET /v1/conversations` | 200 | 29 | `qa-98f53ed9-09df-4b55-88dc-40ab01309088` |
| 6 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-e54d335a-c66e-41a5-a208-4e6d1a8e24a3` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-2518d98d-6bcd-4560-a681-92283ff3f09c` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-b5b17f48-d8a7-4e9b-aef2-accfe8b9edc1` |
| 9 | `POST /v1/auth/token` | 200 | 8 | `qa-325d13c7-ffa1-4951-8ecc-6eac6a2cd5bc` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-401b4271-b35a-4709-8e8a-d6fb4d657481` |
| 11 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-eefebcee-0c18-4c55-ac97-f27ec58f1b7c` |
| 12 | `POST /v1/auth/token` | 401 | 11 | `qa-d9543e5c-7d85-4e21-888a-7b298664fac8` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-532cabca-aa3e-471c-b7e9-460dbd6573e2` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-229260e8-c7ab-4349-820e-96432d642cff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75560721-90af-4df6-b550-490773c613dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75560721-90af-4df6-b550-490773c613dc
Content-Type: application/json

--- request body ---
{"handle":"qa-39245dbe56de","displayName":"QA 39245dbe56de","password":"****","region":"eu"}

--- response: 201 in 345 ms ---
Date: Mon, 23 Nov 2026 10:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-75560721-90af-4df6-b550-490773c613dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-39245dbe56de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_849bfa53-ab62-40af-bfce-f0515cc27c29","handle":"qa-39245dbe56de","displayName":"QA 39245dbe56de","region":"eu","role":"user","createdAt":"2026-11-23T10:54:56.843289906Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-32ffab2c-0735-40c5-8213-668357d930a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ffab2c-0735-40c5-8213-668357d930a5
Content-Type: application/json

--- request body ---
{"handle":"qa-c38272b8b078","displayName":"QA c38272b8b078","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-32ffab2c-0735-40c5-8213-668357d930a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-c38272b8b078
X-Served-Region: eu
Content-Length: 181

{"id":"acc_53a2c208-c89c-4034-b695-b47edb58305b","handle":"qa-c38272b8b078","displayName":"QA c38272b8b078","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.133804627Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-00b2f728-a361-4930-a4a3-8f70bfe8b250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b2f728-a361-4930-a4a3-8f70bfe8b250
Content-Type: application/json

--- request body ---
{"handle":"qa-39245dbe56de","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-00b2f728-a361-4930-a4a3-8f70bfe8b250
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_849bfa53-ab62-40af-bfce-f0515cc27c29"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bbea5e05-bc65-41f0-965d-c6e7ad2ff3b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbea5e05-bc65-41f0-965d-c6e7ad2ff3b3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c38272b8b078","subject":"Contract check","message":"Hello"}

--- response: 201 in 62 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbea5e05-bc65-41f0-965d-c6e7ad2ff3b3
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
Location: /v1/conversations/cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","subject":"Contract check","status":"open","region":"eu","participants":["qa-39245dbe56de","qa-c38272b8b078"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.257256367Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-98f53ed9-09df-4b55-88dc-40ab01309088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98f53ed9-09df-4b55-88dc-40ab01309088
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f53ed9-09df-4b55-88dc-40ab01309088
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
Content-Length: 259

{"items":[{"id":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","subject":"Contract check","status":"open","region":"eu","participants":["qa-39245dbe56de","qa-c38272b8b078"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.257256367Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052
correlation: qa-e54d335a-c66e-41a5-a208-4e6d1a8e24a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e54d335a-c66e-41a5-a208-4e6d1a8e24a3
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e54d335a-c66e-41a5-a208-4e6d1a8e24a3
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","subject":"Contract check","status":"open","region":"eu","participants":["qa-39245dbe56de","qa-c38272b8b078"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.257256367Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052/messages
correlation: qa-2518d98d-6bcd-4560-a681-92283ff3f09c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2518d98d-6bcd-4560-a681-92283ff3f09c
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2518d98d-6bcd-4560-a681-92283ff3f09c
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
Content-Length: 197

{"id":"msg_3cb0a847-140d-4567-a156-cc0a21f3a190","conversationId":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","sender":"qa-39245dbe56de","body":"Second","createdAt":"2026-11-23T10:54:57.444363164Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052/messages
correlation: qa-b5b17f48-d8a7-4e9b-aef2-accfe8b9edc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5b17f48-d8a7-4e9b-aef2-accfe8b9edc1
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5b17f48-d8a7-4e9b-aef2-accfe8b9edc1
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
Content-Length: 416

{"items":[{"id":"msg_3ecb39f7-c9c0-4d8a-8786-d44e3022245c","conversationId":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","sender":"qa-39245dbe56de","body":"Hello","createdAt":"2026-11-23T10:54:57.257594137Z"},{"id":"msg_3cb0a847-140d-4567-a156-cc0a21f3a190","conversationId":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","sender":"qa-39245dbe56de","body":"Second","createdAt":"2026-11-23T10:54:57.444363164Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-325d13c7-ffa1-4951-8ecc-6eac6a2cd5bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325d13c7-ffa1-4951-8ecc-6eac6a2cd5bc
Content-Type: application/json

--- request body ---
{"handle":"qa-c38272b8b078","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-325d13c7-ffa1-4951-8ecc-6eac6a2cd5bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_53a2c208-c89c-4034-b695-b47edb58305b"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052/read
correlation: qa-401b4271-b35a-4709-8e8a-d6fb4d657481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-401b4271-b35a-4709-8e8a-d6fb4d657481
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-401b4271-b35a-4709-8e8a-d6fb4d657481
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
Content-Length: 77

{"conversationId":"cnv_e704dbc7-c0a3-401a-bc69-ef0b4de7b052","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eefebcee-0c18-4c55-ac97-f27ec58f1b7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eefebcee-0c18-4c55-ac97-f27ec58f1b7c
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eefebcee-0c18-4c55-ac97-f27ec58f1b7c
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d9543e5c-7d85-4e21-888a-7b298664fac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9543e5c-7d85-4e21-888a-7b298664fac8
Content-Type: application/json

--- request body ---
{"handle":"qa-c38272b8b078","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9543e5c-7d85-4e21-888a-7b298664fac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9543e5c-7d85-4e21-888a-7b298664fac8"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-532cabca-aa3e-471c-b7e9-460dbd6573e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-532cabca-aa3e-471c-b7e9-460dbd6573e2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-532cabca-aa3e-471c-b7e9-460dbd6573e2
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-229260e8-c7ab-4349-820e-96432d642cff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-229260e8-c7ab-4349-820e-96432d642cff
Content-Type: application/json

--- request body ---
{"handle":"qa-39245dbe56de","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-229260e8-c7ab-4349-820e-96432d642cff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-229260e8-c7ab-4349-820e-96432d642cff"}
```
