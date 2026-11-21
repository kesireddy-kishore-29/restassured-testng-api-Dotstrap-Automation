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
| 1 | `POST /v1/accounts` | 201 | 397 | `qa-3a843ebf-059a-44af-9487-ce298ac081d9` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-a2f53ade-276a-4fd1-bc06-258e1342c4f6` |
| 3 | `POST /v1/accounts` | 201 | 47 | `qa-7633be08-f069-4605-98d5-7344c586e936` |
| 4 | `POST /v1/auth/token` | 200 | 53 | `qa-577eb53e-12c2-47c7-8a66-afbdd43d90bc` |
| 5 | `POST /v1/conversations` | 201 | 86 | `qa-31dd0377-7e21-4ffe-aa8c-8a20d22339db` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-8008ceb6-0039-4170-b99e-86a3ed411f38` |
| 7 | `GET /v1/conversations` | 200 | 24 | `qa-77322534-4c8b-4217-a4e6-35de0dbfddfa` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-85f9f719-cc09-460f-8648-9d7005003ea7` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 25 | `qa-f0eef6a0-5deb-4a4e-9869-51d3ec3f3bc1` |
| 10 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-c31f76cf-acd8-4938-b1f1-e6f2e7295c92` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-52da0ca0-7fff-4044-8032-55e2567fff18` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-426a4925-8589-4417-b49f-8448134b7972` |
| 13 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-9c16453b-8c14-4566-8893-361606d19515` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-eab64377-2c79-42a8-9427-058ce8c437f1` |
| 15 | `GET /v1/credits/balance` | 200 | 21 | `qa-258125a6-e846-4eab-98d2-e8d5aecb0a6a` |
| 16 | `GET /v1/credits/balance` | 200 | 8 | `qa-d24a2d63-e45c-49bf-869a-7ee1ade4c95c` |
| 17 | `POST /v1/auth/token` | 200 | 20 | `qa-7349e2c9-58e6-4559-945a-77361368591b` |
| 18 | `GET /v1/conversations/{id}` | 403 | 20 | `qa-c568b304-feb6-4fdf-8c26-b438c1d9c8fe` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-e9b29868-2d05-482c-bd24-9f57815384ef` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-50c51238-ce4b-451e-b136-b19e00360cc3` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-c42385dc-a7c0-42a9-9c19-b0529f015712` |
| 22 | `GET /v1/credits/balance` | 200 | 7 | `qa-a9337511-04fa-4a32-808a-c2e271904b58` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-156bb863-f565-4b63-abab-a35229fc470d` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-dbc7ab0d-1b88-41d4-9166-ca4aa1f6e8d3` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-f1d82de9-7e39-48d6-80f8-f1dff5ff822f` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-51048fe7-4870-4475-b577-dd5cdc67136a` |
| 27 | `GET /v1/credits/balance` | 200 | 8 | `qa-9086c8c3-2ed0-41d3-9cee-b3c7fb25ddd8` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0d55e9b3-d6b6-40d1-bdb7-72a34f0d712e` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-6e36762e-d3a0-4699-bca8-2c8b228094f7` |
| 30 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a3b49172-3acd-4cde-a6b7-821c7f2fd31b` |
| 31 | `POST /v1/auth/token` | 401 | 9 | `qa-a597dc1a-7ad1-494c-84c4-9c09ccb5f295` |
| 32 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-559f838e-25cf-414b-b255-ee3f801b7a71` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-fb6a1e6f-7ae2-410a-8cfd-809676d069b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a843ebf-059a-44af-9487-ce298ac081d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a843ebf-059a-44af-9487-ce298ac081d9
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8170e6d68a","displayName":"QA ad8170e6d68a","password":"****","region":"eu"}

--- response: 201 in 397 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a843ebf-059a-44af-9487-ce298ac081d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-ad8170e6d68a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b62856dc-5f83-47d8-a34c-1ae59650d6fb","handle":"qa-ad8170e6d68a","displayName":"QA ad8170e6d68a","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.950959137Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2f53ade-276a-4fd1-bc06-258e1342c4f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2f53ade-276a-4fd1-bc06-258e1342c4f6
Content-Type: application/json

--- request body ---
{"handle":"qa-1f9ba1675eb8","displayName":"QA 1f9ba1675eb8","password":"****","region":"us"}

--- response: 201 in 52 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2f53ade-276a-4fd1-bc06-258e1342c4f6
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
Location: /v1/accounts/qa-1f9ba1675eb8
X-Served-Region: us
Content-Length: 181

{"id":"acc_0bf48efb-2065-4a91-8909-fc5f0c81f151","handle":"qa-1f9ba1675eb8","displayName":"QA 1f9ba1675eb8","region":"us","role":"user","createdAt":"2026-11-16T09:53:54.403915249Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-7633be08-f069-4605-98d5-7344c586e936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7633be08-f069-4605-98d5-7344c586e936
Content-Type: application/json

--- request body ---
{"handle":"qa-3c63804f8f6e","displayName":"QA 3c63804f8f6e","password":"****","region":"in"}

--- response: 201 in 47 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7633be08-f069-4605-98d5-7344c586e936
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
Location: /v1/accounts/qa-3c63804f8f6e
X-Served-Region: in
Content-Length: 181

{"id":"acc_058defb8-999b-4877-9152-bfa9366641b6","handle":"qa-3c63804f8f6e","displayName":"QA 3c63804f8f6e","region":"in","role":"user","createdAt":"2026-11-16T09:53:54.521568499Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-577eb53e-12c2-47c7-8a66-afbdd43d90bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577eb53e-12c2-47c7-8a66-afbdd43d90bc
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8170e6d68a","password":"****"}

--- response: 200 in 53 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-577eb53e-12c2-47c7-8a66-afbdd43d90bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b62856dc-5f83-47d8-a34c-1ae59650d6fb"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-31dd0377-7e21-4ffe-aa8c-8a20d22339db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31dd0377-7e21-4ffe-aa8c-8a20d22339db
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f9ba1675eb8","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 86 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-31dd0377-7e21-4ffe-aa8c-8a20d22339db
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
Location: /v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813
X-Data-Region: us
Content-Length: 238

{"id":"cnv_204a090b-ce27-4d50-a575-86247a441813","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ad8170e6d68a","qa-1f9ba1675eb8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.660249007Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8008ceb6-0039-4170-b99e-86a3ed411f38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8008ceb6-0039-4170-b99e-86a3ed411f38
Content-Type: application/json

--- request body ---
{"handle":"qa-1f9ba1675eb8","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8008ceb6-0039-4170-b99e-86a3ed411f38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bf48efb-2065-4a91-8909-fc5f0c81f151"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-77322534-4c8b-4217-a4e6-35de0dbfddfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77322534-4c8b-4217-a4e6-35de0dbfddfa
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-77322534-4c8b-4217-a4e6-35de0dbfddfa
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

{"items":[{"id":"cnv_204a090b-ce27-4d50-a575-86247a441813","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ad8170e6d68a","qa-1f9ba1675eb8"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-16T09:53:54.660249007Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-85f9f719-cc09-460f-8648-9d7005003ea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85f9f719-cc09-460f-8648-9d7005003ea7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-85f9f719-cc09-460f-8648-9d7005003ea7
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

{"items":[{"id":"msg_cda4884a-a6e2-4a18-aa9b-23d751a92ee1","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-ad8170e6d68a","body":"Hi Ben, got a minute?","createdAt":"2026-11-16T09:53:54.660519507Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/read
correlation: qa-f0eef6a0-5deb-4a4e-9869-51d3ec3f3bc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0eef6a0-5deb-4a4e-9869-51d3ec3f3bc1
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0eef6a0-5deb-4a4e-9869-51d3ec3f3bc1
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

{"conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813
correlation: qa-c31f76cf-acd8-4938-b1f1-e6f2e7295c92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31f76cf-acd8-4938-b1f1-e6f2e7295c92
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c31f76cf-acd8-4938-b1f1-e6f2e7295c92
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

{"id":"cnv_204a090b-ce27-4d50-a575-86247a441813","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ad8170e6d68a","qa-1f9ba1675eb8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.660249007Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-52da0ca0-7fff-4044-8032-55e2567fff18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52da0ca0-7fff-4044-8032-55e2567fff18
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-52da0ca0-7fff-4044-8032-55e2567fff18
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

{"id":"msg_38fa74aa-e107-402c-b8a8-30963b309d5e","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-1f9ba1675eb8","body":"Sure, now works","createdAt":"2026-11-16T09:53:55.220360223Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-426a4925-8589-4417-b49f-8448134b7972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-426a4925-8589-4417-b49f-8448134b7972
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-426a4925-8589-4417-b49f-8448134b7972
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

{"id":"msg_99160485-d459-44e1-8dc8-26cb21a195f9","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-1f9ba1675eb8","body":"Calling you","createdAt":"2026-11-16T09:53:55.255724634Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813
correlation: qa-9c16453b-8c14-4566-8893-361606d19515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c16453b-8c14-4566-8893-361606d19515
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c16453b-8c14-4566-8893-361606d19515
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

{"id":"cnv_204a090b-ce27-4d50-a575-86247a441813","subject":"Project kickoff","status":"open","region":"us","participants":["qa-ad8170e6d68a","qa-1f9ba1675eb8"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-16T09:53:54.660249007Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-eab64377-2c79-42a8-9427-058ce8c437f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab64377-2c79-42a8-9427-058ce8c437f1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-eab64377-2c79-42a8-9427-058ce8c437f1
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

{"items":[{"id":"msg_cda4884a-a6e2-4a18-aa9b-23d751a92ee1","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-ad8170e6d68a","body":"Hi Ben, got a minute?","createdAt":"2026-11-16T09:53:54.660519507Z"},{"id":"msg_38fa74aa-e107-402c-b8a8-30963b309d5e","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-1f9ba1675eb8","body":"Sure, now works","createdAt":"2026-11-16T09:53:55.220360223Z"},{"id":"msg_99160485-d459-44e1-8dc8-26cb21a195f9","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-1f9ba1675eb8","body":"Calling you","createdAt":"2026-11-16T09:53:55.255724634Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-258125a6-e846-4eab-98d2-e8d5aecb0a6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-258125a6-e846-4eab-98d2-e8d5aecb0a6a
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-258125a6-e846-4eab-98d2-e8d5aecb0a6a
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

{"balance":4,"currency":"credits","accountId":"acc_b62856dc-5f83-47d8-a34c-1ae59650d6fb"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-d24a2d63-e45c-49bf-869a-7ee1ade4c95c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d24a2d63-e45c-49bf-869a-7ee1ade4c95c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d24a2d63-e45c-49bf-869a-7ee1ade4c95c
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

{"balance":3,"currency":"credits","accountId":"acc_0bf48efb-2065-4a91-8909-fc5f0c81f151"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-7349e2c9-58e6-4559-945a-77361368591b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7349e2c9-58e6-4559-945a-77361368591b
Content-Type: application/json

--- request body ---
{"handle":"qa-3c63804f8f6e","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7349e2c9-58e6-4559-945a-77361368591b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_058defb8-999b-4877-9152-bfa9366641b6"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813
correlation: qa-c568b304-feb6-4fdf-8c26-b438c1d9c8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c568b304-feb6-4fdf-8c26-b438c1d9c8fe
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c568b304-feb6-4fdf-8c26-b438c1d9c8fe
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813","correlationId":"qa-c568b304-feb6-4fdf-8c26-b438c1d9c8fe"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-e9b29868-2d05-482c-bd24-9f57815384ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9b29868-2d05-482c-bd24-9f57815384ef
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9b29868-2d05-482c-bd24-9f57815384ef
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages","correlationId":"qa-e9b29868-2d05-482c-bd24-9f57815384ef"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-50c51238-ce4b-451e-b136-b19e00360cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c51238-ce4b-451e-b136-b19e00360cc3
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50c51238-ce4b-451e-b136-b19e00360cc3
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages","correlationId":"qa-50c51238-ce4b-451e-b136-b19e00360cc3"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-c42385dc-a7c0-42a9-9c19-b0529f015712

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c42385dc-a7c0-42a9-9c19-b0529f015712
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c42385dc-a7c0-42a9-9c19-b0529f015712
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
correlation: qa-a9337511-04fa-4a32-808a-c2e271904b58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9337511-04fa-4a32-808a-c2e271904b58
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9337511-04fa-4a32-808a-c2e271904b58
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

{"balance":5,"currency":"credits","accountId":"acc_058defb8-999b-4877-9152-bfa9366641b6"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/close
correlation: qa-156bb863-f565-4b63-abab-a35229fc470d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-156bb863-f565-4b63-abab-a35229fc470d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-156bb863-f565-4b63-abab-a35229fc470d
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

{"id":"cnv_204a090b-ce27-4d50-a575-86247a441813","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-ad8170e6d68a","qa-1f9ba1675eb8"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-16T09:53:54.660249007Z","closedAt":"2026-11-16T09:53:56.415848057Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/close
correlation: qa-dbc7ab0d-1b88-41d4-9166-ca4aa1f6e8d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbc7ab0d-1b88-41d4-9166-ca4aa1f6e8d3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbc7ab0d-1b88-41d4-9166-ca4aa1f6e8d3
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

{"id":"cnv_204a090b-ce27-4d50-a575-86247a441813","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-ad8170e6d68a","qa-1f9ba1675eb8"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-16T09:53:54.660249007Z","closedAt":"2026-11-16T09:53:56.415848057Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-f1d82de9-7e39-48d6-80f8-f1dff5ff822f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1d82de9-7e39-48d6-80f8-f1dff5ff822f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1d82de9-7e39-48d6-80f8-f1dff5ff822f
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

{"items":[{"id":"msg_cda4884a-a6e2-4a18-aa9b-23d751a92ee1","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-ad8170e6d68a","body":"Hi Ben, got a minute?","createdAt":"2026-11-16T09:53:54.660519507Z"},{"id":"msg_38fa74aa-e107-402c-b8a8-30963b309d5e","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-1f9ba1675eb8","body":"Sure, now works","createdAt":"2026-11-16T09:53:55.220360223Z"},{"id":"msg_99160485-d459-44e1-8dc8-26cb21a195f9","conversationId":"cnv_204a090b-ce27-4d50-a575-86247a441813","sender":"qa-1f9ba1675eb8","body":"Calling you","createdAt":"2026-11-16T09:53:55.255724634Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages
correlation: qa-51048fe7-4870-4475-b577-dd5cdc67136a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51048fe7-4870-4475-b577-dd5cdc67136a
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51048fe7-4870-4475-b577-dd5cdc67136a
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_204a090b-ce27-4d50-a575-86247a441813/messages","correlationId":"qa-51048fe7-4870-4475-b577-dd5cdc67136a"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-9086c8c3-2ed0-41d3-9cee-b3c7fb25ddd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9086c8c3-2ed0-41d3-9cee-b3c7fb25ddd8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9086c8c3-2ed0-41d3-9cee-b3c7fb25ddd8
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

{"balance":3,"currency":"credits","accountId":"acc_0bf48efb-2065-4a91-8909-fc5f0c81f151"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d55e9b3-d6b6-40d1-bdb7-72a34f0d712e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d55e9b3-d6b6-40d1-bdb7-72a34f0d712e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d55e9b3-d6b6-40d1-bdb7-72a34f0d712e
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
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-6e36762e-d3a0-4699-bca8-2c8b228094f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e36762e-d3a0-4699-bca8-2c8b228094f7
Content-Type: application/json

--- request body ---
{"handle":"qa-3c63804f8f6e","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e36762e-d3a0-4699-bca8-2c8b228094f7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e36762e-d3a0-4699-bca8-2c8b228094f7"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3b49172-3acd-4cde-a6b7-821c7f2fd31b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3b49172-3acd-4cde-a6b7-821c7f2fd31b
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3b49172-3acd-4cde-a6b7-821c7f2fd31b
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
correlation: qa-a597dc1a-7ad1-494c-84c4-9c09ccb5f295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a597dc1a-7ad1-494c-84c4-9c09ccb5f295
Content-Type: application/json

--- request body ---
{"handle":"qa-1f9ba1675eb8","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a597dc1a-7ad1-494c-84c4-9c09ccb5f295
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a597dc1a-7ad1-494c-84c4-9c09ccb5f295"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-559f838e-25cf-414b-b255-ee3f801b7a71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-559f838e-25cf-414b-b255-ee3f801b7a71
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-559f838e-25cf-414b-b255-ee3f801b7a71
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
correlation: qa-fb6a1e6f-7ae2-410a-8cfd-809676d069b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb6a1e6f-7ae2-410a-8cfd-809676d069b3
Content-Type: application/json

--- request body ---
{"handle":"qa-ad8170e6d68a","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb6a1e6f-7ae2-410a-8cfd-809676d069b3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb6a1e6f-7ae2-410a-8cfd-809676d069b3"}
```
