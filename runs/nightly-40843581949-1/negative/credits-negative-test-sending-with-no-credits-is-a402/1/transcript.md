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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-46f2835f-c71f-428b-83e1-55471ccdcab0` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-b3674adb-3023-4ff8-b897-c48cba51b507` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-a3f6dc8e-86b8-4297-8327-86fb9c43e843` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-c2595ead-2f04-462e-b612-39a526bbeb59` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 37 | `qa-613f8a7f-fb37-4aeb-8fed-1f1272839807` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-4284fd20-3696-49a1-8aef-979db24ab4e3` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-24920c93-e731-47c8-95e6-a79aae113f0d` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-167f8a01-b35c-4549-b612-a8cebe1dfd11` |
| 9 | `GET /v1/credits/balance` | 200 | 8 | `qa-49e0dbef-83b6-402b-9156-92ffb79201a5` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 9 | `qa-70170323-904e-4ed5-8b0d-06fced7fd941` |
| 11 | `GET /v1/credits/ledger` | 200 | 14 | `qa-383408f0-6edb-4e90-a7ec-9ed635ffbeaa` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-77937ef3-a62d-4827-a03c-f09775df945c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-5fac1aac-8675-48e4-a430-eb459aaf9cf0` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-cd522aa0-bc50-459c-a34d-ff12a2d2d562` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-112bfebc-f5fe-47c4-8d9c-93affba60369` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-01e509f9-c72f-4618-917d-fbfa8ea2f174` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-46f2835f-c71f-428b-83e1-55471ccdcab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46f2835f-c71f-428b-83e1-55471ccdcab0
Content-Type: application/json

--- request body ---
{"handle":"qa-dc87b69c4fb2","displayName":"QA dc87b69c4fb2","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-46f2835f-c71f-428b-83e1-55471ccdcab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Location: /v1/accounts/qa-dc87b69c4fb2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bad93135-cfb2-4a99-babe-6e66cc35c892","handle":"qa-dc87b69c4fb2","displayName":"QA dc87b69c4fb2","region":"eu","role":"user","createdAt":"2026-10-29T08:38:51.648446829Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b3674adb-3023-4ff8-b897-c48cba51b507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3674adb-3023-4ff8-b897-c48cba51b507
Content-Type: application/json

--- request body ---
{"handle":"qa-30f675a4f872","displayName":"QA 30f675a4f872","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3674adb-3023-4ff8-b897-c48cba51b507
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-30f675a4f872
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aeef8a78-f6e4-4e48-9a77-bd3d5e6cf8ed","handle":"qa-30f675a4f872","displayName":"QA 30f675a4f872","region":"eu","role":"user","createdAt":"2026-10-29T08:38:51.678203487Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a3f6dc8e-86b8-4297-8327-86fb9c43e843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3f6dc8e-86b8-4297-8327-86fb9c43e843
Content-Type: application/json

--- request body ---
{"handle":"qa-dc87b69c4fb2","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3f6dc8e-86b8-4297-8327-86fb9c43e843
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bad93135-cfb2-4a99-babe-6e66cc35c892"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c2595ead-2f04-462e-b612-39a526bbeb59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2595ead-2f04-462e-b612-39a526bbeb59
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-30f675a4f872","subject":"Many messages","message":"1"}

--- response: 201 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2595ead-2f04-462e-b612-39a526bbeb59
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
Location: /v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_dd7db383-c773-474b-ae8c-78ea94448606","subject":"Many messages","status":"open","region":"eu","participants":["qa-dc87b69c4fb2","qa-30f675a4f872"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:51.723595941Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606/messages
correlation: qa-613f8a7f-fb37-4aeb-8fed-1f1272839807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-613f8a7f-fb37-4aeb-8fed-1f1272839807
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-613f8a7f-fb37-4aeb-8fed-1f1272839807
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

{"id":"msg_97d8c5fc-62cc-4520-a37c-e74c3ae65849","conversationId":"cnv_dd7db383-c773-474b-ae8c-78ea94448606","sender":"qa-dc87b69c4fb2","body":"2","createdAt":"2026-10-29T08:38:51.765731975Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606/messages
correlation: qa-4284fd20-3696-49a1-8aef-979db24ab4e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4284fd20-3696-49a1-8aef-979db24ab4e3
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4284fd20-3696-49a1-8aef-979db24ab4e3
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

{"id":"msg_ce347642-2361-4f6f-abbd-cdc0ee304dcc","conversationId":"cnv_dd7db383-c773-474b-ae8c-78ea94448606","sender":"qa-dc87b69c4fb2","body":"3","createdAt":"2026-10-29T08:38:51.799405733Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606/messages
correlation: qa-24920c93-e731-47c8-95e6-a79aae113f0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24920c93-e731-47c8-95e6-a79aae113f0d
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-24920c93-e731-47c8-95e6-a79aae113f0d
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

{"id":"msg_2c31bafa-3985-4231-85db-895f6d508c11","conversationId":"cnv_dd7db383-c773-474b-ae8c-78ea94448606","sender":"qa-dc87b69c4fb2","body":"4","createdAt":"2026-10-29T08:38:51.823391834Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606/messages
correlation: qa-167f8a01-b35c-4549-b612-a8cebe1dfd11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167f8a01-b35c-4549-b612-a8cebe1dfd11
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-167f8a01-b35c-4549-b612-a8cebe1dfd11
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

{"id":"msg_c7eb7aa3-c93b-4207-8486-52337e7c746b","conversationId":"cnv_dd7db383-c773-474b-ae8c-78ea94448606","sender":"qa-dc87b69c4fb2","body":"5","createdAt":"2026-10-29T08:38:51.843450690Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-49e0dbef-83b6-402b-9156-92ffb79201a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49e0dbef-83b6-402b-9156-92ffb79201a5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-49e0dbef-83b6-402b-9156-92ffb79201a5
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

{"balance":0,"currency":"credits","accountId":"acc_bad93135-cfb2-4a99-babe-6e66cc35c892"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606/messages
correlation: qa-70170323-904e-4ed5-8b0d-06fced7fd941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70170323-904e-4ed5-8b0d-06fced7fd941
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70170323-904e-4ed5-8b0d-06fced7fd941
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_dd7db383-c773-474b-ae8c-78ea94448606/messages","correlationId":"qa-70170323-904e-4ed5-8b0d-06fced7fd941"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-383408f0-6edb-4e90-a7ec-9ed635ffbeaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383408f0-6edb-4e90-a7ec-9ed635ffbeaa
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-383408f0-6edb-4e90-a7ec-9ed635ffbeaa
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

{"items":[{"id":"led_37de6c99-d21f-41eb-aacf-e59d9dacb418","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:38:51.648458056Z"},{"id":"led_a381dddd-6f07-462e-9c47-03d131464d91","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_dd7db383-c773-474b-ae8c-78ea94448606","createdAt":"2026-10-29T08:38:51.723562741Z"},{"id":"led_1c15b7d9-270e-4a35-a792-00c9c8d791e8","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_97d8c5fc-62cc-4520-a37c-e74c3ae65849","createdAt":"2026-10-29T08:38:51.765697193Z"},{"id":"led_a3d4844f-c389-46aa-b956-016738772ede","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_ce347642-2361-4f6f-abbd-cdc0ee304dcc","createdAt":"2026-10-29T08:38:51.799383530Z"},{"id":"led_1dc489f8-ef59-45bf-9d46-15602212d874","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_2c31bafa-3985-4231-85db-895f6d508c11","createdAt":"2026-10-29T08:38:51.823381598Z"},{"id":"led_652f8c77-7ba3-4858-9a3d-6e1c430791b3","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_c7eb7aa3-c93b-4207-8486-52337e7c746b","createdAt":"2026-10-29T08:38:51.843427175Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-77937ef3-a62d-4827-a03c-f09775df945c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77937ef3-a62d-4827-a03c-f09775df945c
Content-Type: application/json

--- request body ---
{"handle":"qa-30f675a4f872","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-77937ef3-a62d-4827-a03c-f09775df945c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aeef8a78-f6e4-4e48-9a77-bd3d5e6cf8ed"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fac1aac-8675-48e4-a430-eb459aaf9cf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fac1aac-8675-48e4-a430-eb459aaf9cf0
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fac1aac-8675-48e4-a430-eb459aaf9cf0
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
correlation: qa-cd522aa0-bc50-459c-a34d-ff12a2d2d562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd522aa0-bc50-459c-a34d-ff12a2d2d562
Content-Type: application/json

--- request body ---
{"handle":"qa-30f675a4f872","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd522aa0-bc50-459c-a34d-ff12a2d2d562
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd522aa0-bc50-459c-a34d-ff12a2d2d562"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-112bfebc-f5fe-47c4-8d9c-93affba60369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112bfebc-f5fe-47c4-8d9c-93affba60369
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-112bfebc-f5fe-47c4-8d9c-93affba60369
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
correlation: qa-01e509f9-c72f-4618-917d-fbfa8ea2f174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01e509f9-c72f-4618-917d-fbfa8ea2f174
Content-Type: application/json

--- request body ---
{"handle":"qa-dc87b69c4fb2","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01e509f9-c72f-4618-917d-fbfa8ea2f174
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01e509f9-c72f-4618-917d-fbfa8ea2f174"}
```
