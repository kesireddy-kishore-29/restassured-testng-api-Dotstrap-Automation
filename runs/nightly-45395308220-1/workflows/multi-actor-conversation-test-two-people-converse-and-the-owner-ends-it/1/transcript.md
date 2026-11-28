# Transcript: Two people exchange messages; an outsider is kept out; closing stops the thread

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt` |
| Features | FEAT-CONV-01, FEAT-CONV-02, FEAT-CONV-03, FEAT-AUTHZ-01, FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 33 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 535 | `qa-fd7dd8aa-4ace-484f-823e-068920a675a4` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-3d4203b9-76d5-4b6a-a2f0-3b64bec99658` |
| 3 | `POST /v1/accounts` | 201 | 53 | `qa-c57d46af-73fc-4bcc-8c26-808fa37e0920` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-0c0c2643-575b-4dfc-853a-07458781c3da` |
| 5 | `POST /v1/conversations` | 201 | 33 | `qa-79c4dcc7-74af-441e-af2e-75a66bab042d` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-453aa60d-7c89-4f39-9ea4-97096d9edc25` |
| 7 | `GET /v1/conversations` | 200 | 36 | `qa-65e5e737-d772-45c7-9e9c-0f7d8ab4c9f4` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 60 | `qa-ae00b650-fad5-43af-ad56-174e9ca3cef6` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 18 | `qa-92fee494-e226-4a91-8d6f-b4697eced227` |
| 10 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-4c2549d0-af14-41c7-b707-a202feb17511` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-ea22237b-3565-43ef-a856-995af7b8b6ea` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-634861ab-4c13-49ea-8c9b-a1b67274d62f` |
| 13 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-fc5e3632-29d1-4c24-9d17-fc15f6d79b36` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-bb47049c-5c8f-4250-a1f1-cae11ea30f82` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-6af9cde0-b3a8-4ab7-9da2-5c9ca13bc099` |
| 16 | `GET /v1/credits/balance` | 200 | 12 | `qa-835eb575-22ec-4c56-a122-a8cbcf7c8c8f` |
| 17 | `POST /v1/auth/token` | 200 | 27 | `qa-7e7559da-cca1-4c98-b569-9beff7cf3aab` |
| 18 | `GET /v1/conversations/{id}` | 403 | 7 | `qa-aa721608-fae5-458b-a997-0e1ad879f0ef` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 13 | `qa-f55eb9d0-6d27-4b0e-b5ec-570d7e400918` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-495a8560-4d45-42b2-b8e3-4a911c817634` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-298afb42-2b8c-4991-a010-1564a909f6f3` |
| 22 | `GET /v1/credits/balance` | 200 | 8 | `qa-e37784d8-8e15-4ad8-8d9a-409cee7df5da` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-f7e06474-20c3-4f07-86b8-2cd6287198b6` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-ae9bf835-df7b-4489-a764-965802f6e2c6` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-0882213c-6605-43ab-b4d5-83427e7d473b` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 8 | `qa-619d231d-e96d-4400-b7a2-2d1b7e6ffd40` |
| 27 | `GET /v1/credits/balance` | 200 | 7 | `qa-2f8c1737-eb72-4c27-818a-de05db0e4c09` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e2cb9199-95f6-450f-a957-6a656b813383` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-0d8c53d5-d97c-45d4-bf97-c027c70ac63b` |
| 30 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0d361e2e-0250-4eae-a0ce-5d43d7cde551` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-200213a5-c4be-4166-9ff8-08867bcab914` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-529acd77-ae26-4001-82d4-f4829a97fdc2` |
| 33 | `POST /v1/auth/token` | 401 | 7 | `qa-939c73c0-30a2-4d94-85d7-f94fab9230d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd7dd8aa-4ace-484f-823e-068920a675a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd7dd8aa-4ace-484f-823e-068920a675a4
Content-Type: application/json

--- request body ---
{"handle":"qa-0f72dd3414bb","displayName":"QA 0f72dd3414bb","password":"****","region":"eu"}

--- response: 201 in 535 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd7dd8aa-4ace-484f-823e-068920a675a4
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
Location: /v1/accounts/qa-0f72dd3414bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec4557c6-c2ef-487e-a103-11e37d0d9473","handle":"qa-0f72dd3414bb","displayName":"QA 0f72dd3414bb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:09.042173999Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d4203b9-76d5-4b6a-a2f0-3b64bec99658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4203b9-76d5-4b6a-a2f0-3b64bec99658
Content-Type: application/json

--- request body ---
{"handle":"qa-baada6e8eb48","displayName":"QA baada6e8eb48","password":"****","region":"us"}

--- response: 201 in 47 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4203b9-76d5-4b6a-a2f0-3b64bec99658
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-baada6e8eb48
X-Served-Region: us
Content-Length: 181

{"id":"acc_a6a640e1-f0b7-47b0-a018-429c26243adb","handle":"qa-baada6e8eb48","displayName":"QA baada6e8eb48","region":"us","role":"user","createdAt":"2026-11-24T12:38:09.550436268Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c57d46af-73fc-4bcc-8c26-808fa37e0920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c57d46af-73fc-4bcc-8c26-808fa37e0920
Content-Type: application/json

--- request body ---
{"handle":"qa-c8aec141e3b8","displayName":"QA c8aec141e3b8","password":"****","region":"in"}

--- response: 201 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c57d46af-73fc-4bcc-8c26-808fa37e0920
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-c8aec141e3b8
X-Served-Region: in
Content-Length: 181

{"id":"acc_2934b1cf-71f6-4823-a7d2-873ce04528ba","handle":"qa-c8aec141e3b8","displayName":"QA c8aec141e3b8","region":"in","role":"user","createdAt":"2026-11-24T12:38:09.630433669Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0c0c2643-575b-4dfc-853a-07458781c3da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c0c2643-575b-4dfc-853a-07458781c3da
Content-Type: application/json

--- request body ---
{"handle":"qa-0f72dd3414bb","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c0c2643-575b-4dfc-853a-07458781c3da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec4557c6-c2ef-487e-a103-11e37d0d9473"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-79c4dcc7-74af-441e-af2e-75a66bab042d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79c4dcc7-74af-441e-af2e-75a66bab042d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-baada6e8eb48","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-79c4dcc7-74af-441e-af2e-75a66bab042d
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
Location: /v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d
X-Data-Region: us
Content-Length: 238

{"id":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0f72dd3414bb","qa-baada6e8eb48"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:09.780860885Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-453aa60d-7c89-4f39-9ea4-97096d9edc25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-453aa60d-7c89-4f39-9ea4-97096d9edc25
Content-Type: application/json

--- request body ---
{"handle":"qa-baada6e8eb48","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-453aa60d-7c89-4f39-9ea4-97096d9edc25
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6a640e1-f0b7-47b0-a018-429c26243adb"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-65e5e737-d772-45c7-9e9c-0f7d8ab4c9f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65e5e737-d772-45c7-9e9c-0f7d8ab4c9f4
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-65e5e737-d772-45c7-9e9c-0f7d8ab4c9f4
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
X-Served-Region: us
Content-Length: 260

{"items":[{"id":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0f72dd3414bb","qa-baada6e8eb48"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-24T12:38:09.780860885Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-ae00b650-fad5-43af-ad56-174e9ca3cef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae00b650-fad5-43af-ad56-174e9ca3cef6
Content-Type: application/json

--- response: 200 in 60 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae00b650-fad5-43af-ad56-174e9ca3cef6
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
X-Served-Region: us
Content-Length: 234

{"items":[{"id":"msg_9f4a182e-f8ea-4637-9582-eea087f1a570","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-0f72dd3414bb","body":"Hi Ben, got a minute?","createdAt":"2026-11-24T12:38:09.780872717Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/read
correlation: qa-92fee494-e226-4a91-8d6f-b4697eced227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92fee494-e226-4a91-8d6f-b4697eced227
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-92fee494-e226-4a91-8d6f-b4697eced227
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
X-Served-Region: us
Content-Length: 77

{"conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d
correlation: qa-4c2549d0-af14-41c7-b707-a202feb17511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c2549d0-af14-41c7-b707-a202feb17511
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c2549d0-af14-41c7-b707-a202feb17511
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0f72dd3414bb","qa-baada6e8eb48"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:09.780860885Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-ea22237b-3565-43ef-a856-995af7b8b6ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea22237b-3565-43ef-a856-995af7b8b6ea
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea22237b-3565-43ef-a856-995af7b8b6ea
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
X-Served-Region: us
Content-Length: 206

{"id":"msg_4ef82cf8-8abc-4a56-bbd3-74557694998a","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-baada6e8eb48","body":"Sure, now works","createdAt":"2026-11-24T12:38:10.551499474Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-634861ab-4c13-49ea-8c9b-a1b67274d62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-634861ab-4c13-49ea-8c9b-a1b67274d62f
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-634861ab-4c13-49ea-8c9b-a1b67274d62f
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
X-Served-Region: us
Content-Length: 202

{"id":"msg_0f5ed18c-5775-4d17-b8ba-72c6c7798b6a","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-baada6e8eb48","body":"Calling you","createdAt":"2026-11-24T12:38:10.589240550Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d
correlation: qa-fc5e3632-29d1-4c24-9d17-fc15f6d79b36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5e3632-29d1-4c24-9d17-fc15f6d79b36
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc5e3632-29d1-4c24-9d17-fc15f6d79b36
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
X-Data-Region: us
Content-Length: 238

{"id":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","subject":"Project kickoff","status":"open","region":"us","participants":["qa-0f72dd3414bb","qa-baada6e8eb48"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-24T12:38:09.780860885Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-bb47049c-5c8f-4250-a1f1-cae11ea30f82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb47049c-5c8f-4250-a1f1-cae11ea30f82
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb47049c-5c8f-4250-a1f1-cae11ea30f82
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
Content-Length: 644

{"items":[{"id":"msg_9f4a182e-f8ea-4637-9582-eea087f1a570","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-0f72dd3414bb","body":"Hi Ben, got a minute?","createdAt":"2026-11-24T12:38:09.780872717Z"},{"id":"msg_4ef82cf8-8abc-4a56-bbd3-74557694998a","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-baada6e8eb48","body":"Sure, now works","createdAt":"2026-11-24T12:38:10.551499474Z"},{"id":"msg_0f5ed18c-5775-4d17-b8ba-72c6c7798b6a","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-baada6e8eb48","body":"Calling you","createdAt":"2026-11-24T12:38:10.589240550Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-6af9cde0-b3a8-4ab7-9da2-5c9ca13bc099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af9cde0-b3a8-4ab7-9da2-5c9ca13bc099
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6af9cde0-b3a8-4ab7-9da2-5c9ca13bc099
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
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_ec4557c6-c2ef-487e-a103-11e37d0d9473"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-835eb575-22ec-4c56-a122-a8cbcf7c8c8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-835eb575-22ec-4c56-a122-a8cbcf7c8c8f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-835eb575-22ec-4c56-a122-a8cbcf7c8c8f
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
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_a6a640e1-f0b7-47b0-a018-429c26243adb"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-7e7559da-cca1-4c98-b569-9beff7cf3aab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e7559da-cca1-4c98-b569-9beff7cf3aab
Content-Type: application/json

--- request body ---
{"handle":"qa-c8aec141e3b8","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e7559da-cca1-4c98-b569-9beff7cf3aab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2934b1cf-71f6-4823-a7d2-873ce04528ba"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d
correlation: qa-aa721608-fae5-458b-a997-0e1ad879f0ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa721608-fae5-458b-a997-0e1ad879f0ef
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa721608-fae5-458b-a997-0e1ad879f0ef
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
X-Served-Region: in
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","correlationId":"qa-aa721608-fae5-458b-a997-0e1ad879f0ef"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-f55eb9d0-6d27-4b0e-b5ec-570d7e400918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f55eb9d0-6d27-4b0e-b5ec-570d7e400918
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f55eb9d0-6d27-4b0e-b5ec-570d7e400918
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
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages","correlationId":"qa-f55eb9d0-6d27-4b0e-b5ec-570d7e400918"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-495a8560-4d45-42b2-b8e3-4a911c817634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495a8560-4d45-42b2-b8e3-4a911c817634
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-495a8560-4d45-42b2-b8e3-4a911c817634
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
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages","correlationId":"qa-495a8560-4d45-42b2-b8e3-4a911c817634"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-298afb42-2b8c-4991-a010-1564a909f6f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-298afb42-2b8c-4991-a010-1564a909f6f3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-298afb42-2b8c-4991-a010-1564a909f6f3
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
X-Served-Region: in
Content-Length: 22

{"items":[],"total":0}
```

## 22. GET /v1/credits/balance

```text
#22 GET http://localhost:7070/v1/credits/balance
correlation: qa-e37784d8-8e15-4ad8-8d9a-409cee7df5da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e37784d8-8e15-4ad8-8d9a-409cee7df5da
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e37784d8-8e15-4ad8-8d9a-409cee7df5da
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_2934b1cf-71f6-4823-a7d2-873ce04528ba"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/close
correlation: qa-f7e06474-20c3-4f07-86b8-2cd6287198b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7e06474-20c3-4f07-86b8-2cd6287198b6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7e06474-20c3-4f07-86b8-2cd6287198b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-0f72dd3414bb","qa-baada6e8eb48"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-24T12:38:09.780860885Z","closedAt":"2026-11-24T12:38:11.197945513Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/close
correlation: qa-ae9bf835-df7b-4489-a764-965802f6e2c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9bf835-df7b-4489-a764-965802f6e2c6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae9bf835-df7b-4489-a764-965802f6e2c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-0f72dd3414bb","qa-baada6e8eb48"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-24T12:38:09.780860885Z","closedAt":"2026-11-24T12:38:11.197945513Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-0882213c-6605-43ab-b4d5-83427e7d473b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0882213c-6605-43ab-b4d5-83427e7d473b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0882213c-6605-43ab-b4d5-83427e7d473b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_9f4a182e-f8ea-4637-9582-eea087f1a570","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-0f72dd3414bb","body":"Hi Ben, got a minute?","createdAt":"2026-11-24T12:38:09.780872717Z"},{"id":"msg_4ef82cf8-8abc-4a56-bbd3-74557694998a","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-baada6e8eb48","body":"Sure, now works","createdAt":"2026-11-24T12:38:10.551499474Z"},{"id":"msg_0f5ed18c-5775-4d17-b8ba-72c6c7798b6a","conversationId":"cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d","sender":"qa-baada6e8eb48","body":"Calling you","createdAt":"2026-11-24T12:38:10.589240550Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages
correlation: qa-619d231d-e96d-4400-b7a2-2d1b7e6ffd40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-619d231d-e96d-4400-b7a2-2d1b7e6ffd40
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-619d231d-e96d-4400-b7a2-2d1b7e6ffd40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_104ca80e-7a17-4130-b7db-86a9d0c9611d/messages","correlationId":"qa-619d231d-e96d-4400-b7a2-2d1b7e6ffd40"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-2f8c1737-eb72-4c27-818a-de05db0e4c09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f8c1737-eb72-4c27-818a-de05db0e4c09
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f8c1737-eb72-4c27-818a-de05db0e4c09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 9
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_a6a640e1-f0b7-47b0-a018-429c26243adb"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2cb9199-95f6-450f-a957-6a656b813383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2cb9199-95f6-450f-a957-6a656b813383
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2cb9199-95f6-450f-a957-6a656b813383
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
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-0d8c53d5-d97c-45d4-bf97-c027c70ac63b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8c53d5-d97c-45d4-bf97-c027c70ac63b
Content-Type: application/json

--- request body ---
{"handle":"qa-c8aec141e3b8","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d8c53d5-d97c-45d4-bf97-c027c70ac63b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d8c53d5-d97c-45d4-bf97-c027c70ac63b"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d361e2e-0250-4eae-a0ce-5d43d7cde551

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d361e2e-0250-4eae-a0ce-5d43d7cde551
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d361e2e-0250-4eae-a0ce-5d43d7cde551
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 9
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-200213a5-c4be-4166-9ff8-08867bcab914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-200213a5-c4be-4166-9ff8-08867bcab914
Content-Type: application/json

--- request body ---
{"handle":"qa-baada6e8eb48","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-200213a5-c4be-4166-9ff8-08867bcab914
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-200213a5-c4be-4166-9ff8-08867bcab914"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-529acd77-ae26-4001-82d4-f4829a97fdc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-529acd77-ae26-4001-82d4-f4829a97fdc2
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-529acd77-ae26-4001-82d4-f4829a97fdc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 9
X-Served-Region: eu
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-939c73c0-30a2-4d94-85d7-f94fab9230d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-939c73c0-30a2-4d94-85d7-f94fab9230d0
Content-Type: application/json

--- request body ---
{"handle":"qa-0f72dd3414bb","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-939c73c0-30a2-4d94-85d7-f94fab9230d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-939c73c0-30a2-4d94-85d7-f94fab9230d0"}
```
