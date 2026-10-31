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
| 1 | `POST /v1/accounts` | 201 | 475 | `qa-240a5c25-6dbc-4b40-840b-e5643f008a0d` |
| 2 | `POST /v1/accounts` | 201 | 75 | `qa-5bbb7db1-05b5-4d3a-8d50-fa52bcb22a3e` |
| 3 | `POST /v1/accounts` | 201 | 39 | `qa-d55272c6-7339-4e53-aa78-3718d05723b5` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-b261168e-b11e-4998-becf-2ea397b676dc` |
| 5 | `POST /v1/conversations` | 201 | 86 | `qa-bd630bdf-0e5c-4096-8f0d-7080226f6dc1` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-89c8cc99-4083-451c-97df-c7cce60d26c5` |
| 7 | `GET /v1/conversations` | 200 | 21 | `qa-c39400f6-daa9-4726-bd1b-3a8d695b7bee` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 26 | `qa-d70029c1-d1a8-484a-9c79-43f670e82f7f` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-25900e78-50b7-4e0f-a6dd-33a141753860` |
| 10 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-7a298540-9baa-48e0-bbf3-12b1c62fabd8` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-cf3dfa8b-8d44-4056-9840-423037526255` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-a68f03d4-6316-4f35-815e-19875e3cb10f` |
| 13 | `GET /v1/conversations/{id}` | 200 | 15 | `qa-1f9215b8-0386-436f-885c-9be5d76bd65e` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-db7a5deb-31e2-4f1c-a213-57b185613c32` |
| 15 | `GET /v1/credits/balance` | 200 | 17 | `qa-3c3948f2-a09a-4b40-884b-8fb78c49aa53` |
| 16 | `GET /v1/credits/balance` | 200 | 17 | `qa-185dbf18-bc15-4064-b1d2-642784ce46c7` |
| 17 | `POST /v1/auth/token` | 200 | 29 | `qa-64141860-74b2-4d5f-81c6-a4f823695c1d` |
| 18 | `GET /v1/conversations/{id}` | 403 | 26 | `qa-0d58f18d-9f4a-4b61-957c-af0024d8cf0b` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-2611066b-a3b9-46ae-82e8-aa12d1b0d5b2` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-f3d21ed5-2de5-4fdc-8ad8-768996eb4666` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-799950e5-e3ad-4de0-9f6c-0b0783b5906f` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-5135cba3-ca89-46cb-bbdb-5b7d0cbf62e6` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-69315714-b34e-4661-ad49-1823d189d941` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 9 | `qa-39505c9e-2899-4530-8ba0-0d7be955d3e6` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-9fbde6f1-0ab6-41ce-9f60-4dce06a24825` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 9 | `qa-09681314-f8b2-4694-9d87-7430053d6361` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-830d2088-6a6a-4cfe-84ab-89ecfcd83d1e` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-08050629-906e-4553-a16f-45bb6bc95ed2` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-b675a1c5-7145-4307-a348-92c4055ce108` |
| 30 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-82eb575f-d52d-42d8-82ed-affda6fb83bc` |
| 31 | `POST /v1/auth/token` | 401 | 9 | `qa-92d0fac0-1e1f-4a9c-8570-71145db4c515` |
| 32 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-3e32cca4-3d57-4693-8fb5-c48baaea8ccb` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-42d4df78-dccc-47ec-a7e0-c961af1661aa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-240a5c25-6dbc-4b40-840b-e5643f008a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-240a5c25-6dbc-4b40-840b-e5643f008a0d
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb05cb32579","displayName":"QA aeb05cb32579","password":"****","region":"eu"}

--- response: 201 in 475 ms ---
Date: Sat, 24 Oct 2026 07:25:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-240a5c25-6dbc-4b40-840b-e5643f008a0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-aeb05cb32579
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c0e6542-ea47-41ee-836f-0bb377051719","handle":"qa-aeb05cb32579","displayName":"QA aeb05cb32579","region":"eu","role":"user","createdAt":"2026-10-24T07:25:34.813833461Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5bbb7db1-05b5-4d3a-8d50-fa52bcb22a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bbb7db1-05b5-4d3a-8d50-fa52bcb22a3e
Content-Type: application/json

--- request body ---
{"handle":"qa-ab1e84e9a165","displayName":"QA ab1e84e9a165","password":"****","region":"us"}

--- response: 201 in 75 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bbb7db1-05b5-4d3a-8d50-fa52bcb22a3e
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
Location: /v1/accounts/qa-ab1e84e9a165
X-Served-Region: us
Content-Length: 181

{"id":"acc_4fafa75f-bae6-4a26-8156-c28a7c8ead40","handle":"qa-ab1e84e9a165","displayName":"QA ab1e84e9a165","region":"us","role":"user","createdAt":"2026-10-24T07:25:35.370368798Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d55272c6-7339-4e53-aa78-3718d05723b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d55272c6-7339-4e53-aa78-3718d05723b5
Content-Type: application/json

--- request body ---
{"handle":"qa-877d10222412","displayName":"QA 877d10222412","password":"****","region":"in"}

--- response: 201 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d55272c6-7339-4e53-aa78-3718d05723b5
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
Location: /v1/accounts/qa-877d10222412
X-Served-Region: in
Content-Length: 181

{"id":"acc_989b3132-de00-495b-9034-ef7108e4e24e","handle":"qa-877d10222412","displayName":"QA 877d10222412","region":"in","role":"user","createdAt":"2026-10-24T07:25:35.448262814Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b261168e-b11e-4998-becf-2ea397b676dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b261168e-b11e-4998-becf-2ea397b676dc
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb05cb32579","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b261168e-b11e-4998-becf-2ea397b676dc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c0e6542-ea47-41ee-836f-0bb377051719"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-bd630bdf-0e5c-4096-8f0d-7080226f6dc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd630bdf-0e5c-4096-8f0d-7080226f6dc1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab1e84e9a165","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 86 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd630bdf-0e5c-4096-8f0d-7080226f6dc1
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
Location: /v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a
X-Data-Region: us
Content-Length: 238

{"id":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","subject":"Project kickoff","status":"open","region":"us","participants":["qa-aeb05cb32579","qa-ab1e84e9a165"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:35.647517166Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-89c8cc99-4083-451c-97df-c7cce60d26c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89c8cc99-4083-451c-97df-c7cce60d26c5
Content-Type: application/json

--- request body ---
{"handle":"qa-ab1e84e9a165","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-89c8cc99-4083-451c-97df-c7cce60d26c5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fafa75f-bae6-4a26-8156-c28a7c8ead40"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-c39400f6-daa9-4726-bd1b-3a8d695b7bee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39400f6-daa9-4726-bd1b-3a8d695b7bee
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c39400f6-daa9-4726-bd1b-3a8d695b7bee
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

{"items":[{"id":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","subject":"Project kickoff","status":"open","region":"us","participants":["qa-aeb05cb32579","qa-ab1e84e9a165"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-24T07:25:35.647517166Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-d70029c1-d1a8-484a-9c79-43f670e82f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d70029c1-d1a8-484a-9c79-43f670e82f7f
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d70029c1-d1a8-484a-9c79-43f670e82f7f
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

{"items":[{"id":"msg_467ae2cf-ae3c-4ee7-bfa7-6263029e2c78","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-aeb05cb32579","body":"Hi Ben, got a minute?","createdAt":"2026-10-24T07:25:35.647775515Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/read
correlation: qa-25900e78-50b7-4e0f-a6dd-33a141753860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25900e78-50b7-4e0f-a6dd-33a141753860
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-25900e78-50b7-4e0f-a6dd-33a141753860
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

{"conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a
correlation: qa-7a298540-9baa-48e0-bbf3-12b1c62fabd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a298540-9baa-48e0-bbf3-12b1c62fabd8
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a298540-9baa-48e0-bbf3-12b1c62fabd8
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

{"id":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","subject":"Project kickoff","status":"open","region":"us","participants":["qa-aeb05cb32579","qa-ab1e84e9a165"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:35.647517166Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-cf3dfa8b-8d44-4056-9840-423037526255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf3dfa8b-8d44-4056-9840-423037526255
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf3dfa8b-8d44-4056-9840-423037526255
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

{"id":"msg_33e294bb-3d7d-4428-ba98-9c831a4addeb","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-ab1e84e9a165","body":"Sure, now works","createdAt":"2026-10-24T07:25:36.145097483Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-a68f03d4-6316-4f35-815e-19875e3cb10f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a68f03d4-6316-4f35-815e-19875e3cb10f
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a68f03d4-6316-4f35-815e-19875e3cb10f
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

{"id":"msg_4b5e3913-df4b-46e4-8b95-b9e22574c128","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-ab1e84e9a165","body":"Calling you","createdAt":"2026-10-24T07:25:36.179893211Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a
correlation: qa-1f9215b8-0386-436f-885c-9be5d76bd65e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f9215b8-0386-436f-885c-9be5d76bd65e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f9215b8-0386-436f-885c-9be5d76bd65e
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

{"id":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","subject":"Project kickoff","status":"open","region":"us","participants":["qa-aeb05cb32579","qa-ab1e84e9a165"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-24T07:25:35.647517166Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-db7a5deb-31e2-4f1c-a213-57b185613c32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db7a5deb-31e2-4f1c-a213-57b185613c32
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-db7a5deb-31e2-4f1c-a213-57b185613c32
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

{"items":[{"id":"msg_467ae2cf-ae3c-4ee7-bfa7-6263029e2c78","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-aeb05cb32579","body":"Hi Ben, got a minute?","createdAt":"2026-10-24T07:25:35.647775515Z"},{"id":"msg_33e294bb-3d7d-4428-ba98-9c831a4addeb","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-ab1e84e9a165","body":"Sure, now works","createdAt":"2026-10-24T07:25:36.145097483Z"},{"id":"msg_4b5e3913-df4b-46e4-8b95-b9e22574c128","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-ab1e84e9a165","body":"Calling you","createdAt":"2026-10-24T07:25:36.179893211Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-3c3948f2-a09a-4b40-884b-8fb78c49aa53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c3948f2-a09a-4b40-884b-8fb78c49aa53
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c3948f2-a09a-4b40-884b-8fb78c49aa53
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

{"balance":4,"currency":"credits","accountId":"acc_8c0e6542-ea47-41ee-836f-0bb377051719"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-185dbf18-bc15-4064-b1d2-642784ce46c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185dbf18-bc15-4064-b1d2-642784ce46c7
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-185dbf18-bc15-4064-b1d2-642784ce46c7
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

{"balance":3,"currency":"credits","accountId":"acc_4fafa75f-bae6-4a26-8156-c28a7c8ead40"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-64141860-74b2-4d5f-81c6-a4f823695c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64141860-74b2-4d5f-81c6-a4f823695c1d
Content-Type: application/json

--- request body ---
{"handle":"qa-877d10222412","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-64141860-74b2-4d5f-81c6-a4f823695c1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_989b3132-de00-495b-9034-ef7108e4e24e"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a
correlation: qa-0d58f18d-9f4a-4b61-957c-af0024d8cf0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d58f18d-9f4a-4b61-957c-af0024d8cf0b
Content-Type: application/json

--- response: 403 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d58f18d-9f4a-4b61-957c-af0024d8cf0b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a","correlationId":"qa-0d58f18d-9f4a-4b61-957c-af0024d8cf0b"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-2611066b-a3b9-46ae-82e8-aa12d1b0d5b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2611066b-a3b9-46ae-82e8-aa12d1b0d5b2
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2611066b-a3b9-46ae-82e8-aa12d1b0d5b2
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages","correlationId":"qa-2611066b-a3b9-46ae-82e8-aa12d1b0d5b2"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-f3d21ed5-2de5-4fdc-8ad8-768996eb4666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3d21ed5-2de5-4fdc-8ad8-768996eb4666
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3d21ed5-2de5-4fdc-8ad8-768996eb4666
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages","correlationId":"qa-f3d21ed5-2de5-4fdc-8ad8-768996eb4666"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-799950e5-e3ad-4de0-9f6c-0b0783b5906f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799950e5-e3ad-4de0-9f6c-0b0783b5906f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-799950e5-e3ad-4de0-9f6c-0b0783b5906f
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
correlation: qa-5135cba3-ca89-46cb-bbdb-5b7d0cbf62e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5135cba3-ca89-46cb-bbdb-5b7d0cbf62e6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5135cba3-ca89-46cb-bbdb-5b7d0cbf62e6
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

{"balance":5,"currency":"credits","accountId":"acc_989b3132-de00-495b-9034-ef7108e4e24e"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/close
correlation: qa-69315714-b34e-4661-ad49-1823d189d941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69315714-b34e-4661-ad49-1823d189d941
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-69315714-b34e-4661-ad49-1823d189d941
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

{"id":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-aeb05cb32579","qa-ab1e84e9a165"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-24T07:25:35.647517166Z","closedAt":"2026-10-24T07:25:37.360433962Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/close
correlation: qa-39505c9e-2899-4530-8ba0-0d7be955d3e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39505c9e-2899-4530-8ba0-0d7be955d3e6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-39505c9e-2899-4530-8ba0-0d7be955d3e6
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

{"id":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-aeb05cb32579","qa-ab1e84e9a165"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-24T07:25:35.647517166Z","closedAt":"2026-10-24T07:25:37.360433962Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-9fbde6f1-0ab6-41ce-9f60-4dce06a24825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fbde6f1-0ab6-41ce-9f60-4dce06a24825
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fbde6f1-0ab6-41ce-9f60-4dce06a24825
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

{"items":[{"id":"msg_467ae2cf-ae3c-4ee7-bfa7-6263029e2c78","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-aeb05cb32579","body":"Hi Ben, got a minute?","createdAt":"2026-10-24T07:25:35.647775515Z"},{"id":"msg_33e294bb-3d7d-4428-ba98-9c831a4addeb","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-ab1e84e9a165","body":"Sure, now works","createdAt":"2026-10-24T07:25:36.145097483Z"},{"id":"msg_4b5e3913-df4b-46e4-8b95-b9e22574c128","conversationId":"cnv_77858c59-7cfa-41af-8e17-546e3406078a","sender":"qa-ab1e84e9a165","body":"Calling you","createdAt":"2026-10-24T07:25:36.179893211Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages
correlation: qa-09681314-f8b2-4694-9d87-7430053d6361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09681314-f8b2-4694-9d87-7430053d6361
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09681314-f8b2-4694-9d87-7430053d6361
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_77858c59-7cfa-41af-8e17-546e3406078a/messages","correlationId":"qa-09681314-f8b2-4694-9d87-7430053d6361"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-830d2088-6a6a-4cfe-84ab-89ecfcd83d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-830d2088-6a6a-4cfe-84ab-89ecfcd83d1e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-830d2088-6a6a-4cfe-84ab-89ecfcd83d1e
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

{"balance":3,"currency":"credits","accountId":"acc_4fafa75f-bae6-4a26-8156-c28a7c8ead40"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08050629-906e-4553-a16f-45bb6bc95ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08050629-906e-4553-a16f-45bb6bc95ed2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08050629-906e-4553-a16f-45bb6bc95ed2
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
correlation: qa-b675a1c5-7145-4307-a348-92c4055ce108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b675a1c5-7145-4307-a348-92c4055ce108
Content-Type: application/json

--- request body ---
{"handle":"qa-877d10222412","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b675a1c5-7145-4307-a348-92c4055ce108
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b675a1c5-7145-4307-a348-92c4055ce108"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82eb575f-d52d-42d8-82ed-affda6fb83bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82eb575f-d52d-42d8-82ed-affda6fb83bc
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82eb575f-d52d-42d8-82ed-affda6fb83bc
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
correlation: qa-92d0fac0-1e1f-4a9c-8570-71145db4c515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d0fac0-1e1f-4a9c-8570-71145db4c515
Content-Type: application/json

--- request body ---
{"handle":"qa-ab1e84e9a165","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92d0fac0-1e1f-4a9c-8570-71145db4c515
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92d0fac0-1e1f-4a9c-8570-71145db4c515"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e32cca4-3d57-4693-8fb5-c48baaea8ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e32cca4-3d57-4693-8fb5-c48baaea8ccb
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e32cca4-3d57-4693-8fb5-c48baaea8ccb
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
correlation: qa-42d4df78-dccc-47ec-a7e0-c961af1661aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d4df78-dccc-47ec-a7e0-c961af1661aa
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb05cb32579","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42d4df78-dccc-47ec-a7e0-c961af1661aa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42d4df78-dccc-47ec-a7e0-c961af1661aa"}
```
