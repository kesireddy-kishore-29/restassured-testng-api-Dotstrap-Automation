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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-18bc077d-9643-4bd9-9529-669f04efe50d` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-d68ae2fb-42d2-4de6-b339-34d60bed073c` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-6fd73e6d-f8a9-4654-a24f-e2fdc23c08a5` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-98e94132-cf3f-40b1-adcf-82c5482ae58a` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-24cb1692-0db7-4d12-811e-720882748894` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-c0e9bc98-9088-4062-a8d3-f2182dbc917a` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-b9383a3a-40fb-411c-a384-1a6583bb037a` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-40bf35ab-dde5-47ce-ab6e-036ad1571042` |
| 9 | `GET /v1/credits/balance` | 200 | 13 | `qa-79883227-9381-45ed-8d63-3beb816354e1` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 9 | `qa-7607678d-63ad-478b-97b5-2d78b2b5aba9` |
| 11 | `GET /v1/credits/ledger` | 200 | 12 | `qa-72eea9cf-82d2-4fef-ac30-3c7aed2f7fb5` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-4d2325af-e0ec-4377-a403-0c50ff388d63` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4635b52a-73d3-409a-9d2e-d62b57315d5a` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-000138f3-c729-438c-a77c-87e6797a0f4e` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-0f63c684-86b3-49b6-8dfc-2fd07bb0cadb` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-71873ce4-b102-4460-8083-19993b51579f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18bc077d-9643-4bd9-9529-669f04efe50d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18bc077d-9643-4bd9-9529-669f04efe50d
Content-Type: application/json

--- request body ---
{"handle":"qa-1b0d6556cf56","displayName":"QA 1b0d6556cf56","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-18bc077d-9643-4bd9-9529-669f04efe50d
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
Location: /v1/accounts/qa-1b0d6556cf56
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bfa2595b-5fdb-48ac-a15b-d1097f7fa663","handle":"qa-1b0d6556cf56","displayName":"QA 1b0d6556cf56","region":"eu","role":"user","createdAt":"2026-11-25T11:28:07.218287816Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d68ae2fb-42d2-4de6-b339-34d60bed073c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68ae2fb-42d2-4de6-b339-34d60bed073c
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc76561e541","displayName":"QA 7bc76561e541","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d68ae2fb-42d2-4de6-b339-34d60bed073c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-7bc76561e541
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34816b5b-a27c-4e83-811c-3505853dcb1b","handle":"qa-7bc76561e541","displayName":"QA 7bc76561e541","region":"eu","role":"user","createdAt":"2026-11-25T11:28:07.260983311Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6fd73e6d-f8a9-4654-a24f-e2fdc23c08a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fd73e6d-f8a9-4654-a24f-e2fdc23c08a5
Content-Type: application/json

--- request body ---
{"handle":"qa-1b0d6556cf56","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fd73e6d-f8a9-4654-a24f-e2fdc23c08a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bfa2595b-5fdb-48ac-a15b-d1097f7fa663"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-98e94132-cf3f-40b1-adcf-82c5482ae58a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e94132-cf3f-40b1-adcf-82c5482ae58a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7bc76561e541","subject":"Many messages","message":"1"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-98e94132-cf3f-40b1-adcf-82c5482ae58a
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
Location: /v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_ad83291d-8763-493d-a3b8-47743df77469","subject":"Many messages","status":"open","region":"eu","participants":["qa-1b0d6556cf56","qa-7bc76561e541"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:28:07.336493993Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469/messages
correlation: qa-24cb1692-0db7-4d12-811e-720882748894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24cb1692-0db7-4d12-811e-720882748894
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-24cb1692-0db7-4d12-811e-720882748894
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

{"id":"msg_53ef4cc3-c785-4046-bd25-c9e82914befb","conversationId":"cnv_ad83291d-8763-493d-a3b8-47743df77469","sender":"qa-1b0d6556cf56","body":"2","createdAt":"2026-11-25T11:28:07.364480377Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469/messages
correlation: qa-c0e9bc98-9088-4062-a8d3-f2182dbc917a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0e9bc98-9088-4062-a8d3-f2182dbc917a
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0e9bc98-9088-4062-a8d3-f2182dbc917a
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

{"id":"msg_7600ee79-47c6-4f78-b597-35856c7a4493","conversationId":"cnv_ad83291d-8763-493d-a3b8-47743df77469","sender":"qa-1b0d6556cf56","body":"3","createdAt":"2026-11-25T11:28:07.402978811Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469/messages
correlation: qa-b9383a3a-40fb-411c-a384-1a6583bb037a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9383a3a-40fb-411c-a384-1a6583bb037a
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9383a3a-40fb-411c-a384-1a6583bb037a
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

{"id":"msg_46c342fa-9d8b-4590-be11-359fbbe4416c","conversationId":"cnv_ad83291d-8763-493d-a3b8-47743df77469","sender":"qa-1b0d6556cf56","body":"4","createdAt":"2026-11-25T11:28:07.416902831Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469/messages
correlation: qa-40bf35ab-dde5-47ce-ab6e-036ad1571042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40bf35ab-dde5-47ce-ab6e-036ad1571042
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-40bf35ab-dde5-47ce-ab6e-036ad1571042
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

{"id":"msg_ea740f85-fab2-4918-be63-19fa0a836c9d","conversationId":"cnv_ad83291d-8763-493d-a3b8-47743df77469","sender":"qa-1b0d6556cf56","body":"5","createdAt":"2026-11-25T11:28:07.434653280Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-79883227-9381-45ed-8d63-3beb816354e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79883227-9381-45ed-8d63-3beb816354e1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-79883227-9381-45ed-8d63-3beb816354e1
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

{"balance":0,"currency":"credits","accountId":"acc_bfa2595b-5fdb-48ac-a15b-d1097f7fa663"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469/messages
correlation: qa-7607678d-63ad-478b-97b5-2d78b2b5aba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7607678d-63ad-478b-97b5-2d78b2b5aba9
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 9 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7607678d-63ad-478b-97b5-2d78b2b5aba9
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_ad83291d-8763-493d-a3b8-47743df77469/messages","correlationId":"qa-7607678d-63ad-478b-97b5-2d78b2b5aba9"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-72eea9cf-82d2-4fef-ac30-3c7aed2f7fb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72eea9cf-82d2-4fef-ac30-3c7aed2f7fb5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-72eea9cf-82d2-4fef-ac30-3c7aed2f7fb5
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

{"items":[{"id":"led_3a3aae29-da68-4881-8178-74641b4fd49a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:28:07.218302403Z"},{"id":"led_e9d39eb6-ac7c-47b9-b00e-5396e45d8c08","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ad83291d-8763-493d-a3b8-47743df77469","createdAt":"2026-11-25T11:28:07.336451814Z"},{"id":"led_2f2e144a-4611-4380-8044-5a0a5f2956f1","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_53ef4cc3-c785-4046-bd25-c9e82914befb","createdAt":"2026-11-25T11:28:07.364442136Z"},{"id":"led_4b1ffc31-32b2-4879-83f5-c5d951e9610f","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_7600ee79-47c6-4f78-b597-35856c7a4493","createdAt":"2026-11-25T11:28:07.402943856Z"},{"id":"led_40e51411-0b32-482c-94a3-fae0de59b0b2","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_46c342fa-9d8b-4590-be11-359fbbe4416c","createdAt":"2026-11-25T11:28:07.416853769Z"},{"id":"led_3de89691-dbcf-4814-95c7-5df606563522","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_ea740f85-fab2-4918-be63-19fa0a836c9d","createdAt":"2026-11-25T11:28:07.434616952Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4d2325af-e0ec-4377-a403-0c50ff388d63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d2325af-e0ec-4377-a403-0c50ff388d63
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc76561e541","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d2325af-e0ec-4377-a403-0c50ff388d63
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34816b5b-a27c-4e83-811c-3505853dcb1b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4635b52a-73d3-409a-9d2e-d62b57315d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4635b52a-73d3-409a-9d2e-d62b57315d5a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4635b52a-73d3-409a-9d2e-d62b57315d5a
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
correlation: qa-000138f3-c729-438c-a77c-87e6797a0f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-000138f3-c729-438c-a77c-87e6797a0f4e
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc76561e541","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-000138f3-c729-438c-a77c-87e6797a0f4e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-000138f3-c729-438c-a77c-87e6797a0f4e"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f63c684-86b3-49b6-8dfc-2fd07bb0cadb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f63c684-86b3-49b6-8dfc-2fd07bb0cadb
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f63c684-86b3-49b6-8dfc-2fd07bb0cadb
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
correlation: qa-71873ce4-b102-4460-8083-19993b51579f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71873ce4-b102-4460-8083-19993b51579f
Content-Type: application/json

--- request body ---
{"handle":"qa-1b0d6556cf56","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71873ce4-b102-4460-8083-19993b51579f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71873ce4-b102-4460-8083-19993b51579f"}
```
