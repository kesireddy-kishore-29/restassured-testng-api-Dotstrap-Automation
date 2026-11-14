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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-ec3efef3-49cd-403e-8f4a-34172da38580` |
| 2 | `POST /v1/accounts` | 201 | 70 | `qa-7116b4b2-1b7a-401f-b998-d170dadcaa26` |
| 3 | `POST /v1/accounts` | 201 | 74 | `qa-d193bffb-e50d-4a70-b600-96f88e677ec5` |
| 4 | `POST /v1/auth/token` | 200 | 91 | `qa-9151cbe7-c2ef-4fee-ba6a-54cf4c6a7c8a` |
| 5 | `POST /v1/conversations` | 201 | 20 | `qa-affe5fcc-4563-466b-948a-cb99a907376b` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-7e1b08b8-d80f-43d0-8aa4-cece6cc718db` |
| 7 | `GET /v1/conversations` | 200 | 27 | `qa-d2db0bcf-149e-4f0d-ba9c-0944ce761bf1` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 42 | `qa-d190728c-fbdc-4677-8b68-551d5546db4f` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 23 | `qa-f00727e1-0ae0-49e7-b06c-7cc722984bc8` |
| 10 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-f0c77a17-a11f-405e-accc-9f0ba3624a24` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-8ae7836f-d184-4d6e-a6c0-71f566dcb7bd` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-4f45f17d-57b2-4352-9841-671de6ea1979` |
| 13 | `GET /v1/conversations/{id}` | 200 | 21 | `qa-f4565717-86b9-443a-9c56-eec9d5be2ce2` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-7f937770-f204-4bde-b664-336664b3c39b` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-8ca20ef9-e565-48b9-93e9-7d8cdfad055c` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-b4addea3-4ad0-4e1a-b941-12a8946c45e1` |
| 17 | `POST /v1/auth/token` | 200 | 21 | `qa-4363982b-dcef-4e68-8d3d-8aef8177be01` |
| 18 | `GET /v1/conversations/{id}` | 403 | 13 | `qa-0fde8512-e5d3-4710-9f39-6933d678bc79` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-bc523668-462e-4ab5-bcf2-2af9c4552b4d` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-6a97d7b2-1514-4af3-9815-a003d3ad7fdc` |
| 21 | `GET /v1/conversations` | 200 | 7 | `qa-a2038bf8-05eb-46be-8053-ec5c0d1fd61a` |
| 22 | `GET /v1/credits/balance` | 200 | 6 | `qa-7990931b-ae27-4cda-9133-17fbc114f902` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-c6d8183c-18f4-4a7e-9232-e959705b7811` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-2b88af75-57b7-4b57-bd0b-4c309ad18176` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-ab47cfea-287c-4aae-b953-034f71f5972f` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-70a33e6d-9f2c-4b91-b9b5-0b222a65bd47` |
| 27 | `GET /v1/credits/balance` | 200 | 9 | `qa-437a3db5-5f9a-4c75-abd8-eff314c18834` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-989834fa-4138-410d-b053-1f7ae2a1d87e` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-07707cd7-c973-4e56-8c0b-b054a765f93c` |
| 30 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-98771f2e-7289-441f-847f-ef896787e142` |
| 31 | `POST /v1/auth/token` | 401 | 5 | `qa-a639f107-93fc-41ab-937e-43ee6ddc0ec6` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e8c03059-d9cc-402d-a14f-36c65c1ccb14` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-b5edae3f-e7d5-4ab2-851d-849a6620944d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ec3efef3-49cd-403e-8f4a-34172da38580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec3efef3-49cd-403e-8f4a-34172da38580
Content-Type: application/json

--- request body ---
{"handle":"qa-d7c0b6ef3c99","displayName":"QA d7c0b6ef3c99","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec3efef3-49cd-403e-8f4a-34172da38580
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
Location: /v1/accounts/qa-d7c0b6ef3c99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35930dd9-f4d3-4dab-9bc3-296d02008791","handle":"qa-d7c0b6ef3c99","displayName":"QA d7c0b6ef3c99","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.091728642Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7116b4b2-1b7a-401f-b998-d170dadcaa26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7116b4b2-1b7a-401f-b998-d170dadcaa26
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6a6699ce7c","displayName":"QA 6e6a6699ce7c","password":"****","region":"us"}

--- response: 201 in 70 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7116b4b2-1b7a-401f-b998-d170dadcaa26
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
Location: /v1/accounts/qa-6e6a6699ce7c
X-Served-Region: us
Content-Length: 181

{"id":"acc_a13f9ea7-e6e9-4d14-a2b3-5e9ab82fc4e9","handle":"qa-6e6a6699ce7c","displayName":"QA 6e6a6699ce7c","region":"us","role":"user","createdAt":"2026-11-07T08:55:03.548290779Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d193bffb-e50d-4a70-b600-96f88e677ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d193bffb-e50d-4a70-b600-96f88e677ec5
Content-Type: application/json

--- request body ---
{"handle":"qa-5dfb780f5b71","displayName":"QA 5dfb780f5b71","password":"****","region":"in"}

--- response: 201 in 74 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d193bffb-e50d-4a70-b600-96f88e677ec5
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
Location: /v1/accounts/qa-5dfb780f5b71
X-Served-Region: in
Content-Length: 181

{"id":"acc_c5e03c5d-25b8-4abb-b245-dcec1c824edc","handle":"qa-5dfb780f5b71","displayName":"QA 5dfb780f5b71","region":"in","role":"user","createdAt":"2026-11-07T08:55:03.656508862Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9151cbe7-c2ef-4fee-ba6a-54cf4c6a7c8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9151cbe7-c2ef-4fee-ba6a-54cf4c6a7c8a
Content-Type: application/json

--- request body ---
{"handle":"qa-d7c0b6ef3c99","password":"****"}

--- response: 200 in 91 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9151cbe7-c2ef-4fee-ba6a-54cf4c6a7c8a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35930dd9-f4d3-4dab-9bc3-296d02008791"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-affe5fcc-4563-466b-948a-cb99a907376b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-affe5fcc-4563-466b-948a-cb99a907376b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6e6a6699ce7c","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 20 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-affe5fcc-4563-466b-948a-cb99a907376b
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
Location: /v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461
X-Data-Region: us
Content-Length: 238

{"id":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d7c0b6ef3c99","qa-6e6a6699ce7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.821480265Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7e1b08b8-d80f-43d0-8aa4-cece6cc718db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e1b08b8-d80f-43d0-8aa4-cece6cc718db
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6a6699ce7c","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e1b08b8-d80f-43d0-8aa4-cece6cc718db
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a13f9ea7-e6e9-4d14-a2b3-5e9ab82fc4e9"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-d2db0bcf-149e-4f0d-ba9c-0944ce761bf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2db0bcf-149e-4f0d-ba9c-0944ce761bf1
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2db0bcf-149e-4f0d-ba9c-0944ce761bf1
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

{"items":[{"id":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d7c0b6ef3c99","qa-6e6a6699ce7c"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-07T08:55:03.821480265Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-d190728c-fbdc-4677-8b68-551d5546db4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d190728c-fbdc-4677-8b68-551d5546db4f
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d190728c-fbdc-4677-8b68-551d5546db4f
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

{"items":[{"id":"msg_dc1e1317-5407-4d4a-b8f7-faee0011d2a1","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-d7c0b6ef3c99","body":"Hi Ben, got a minute?","createdAt":"2026-11-07T08:55:03.821516272Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/read
correlation: qa-f00727e1-0ae0-49e7-b06c-7cc722984bc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f00727e1-0ae0-49e7-b06c-7cc722984bc8
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f00727e1-0ae0-49e7-b06c-7cc722984bc8
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

{"conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461
correlation: qa-f0c77a17-a11f-405e-accc-9f0ba3624a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0c77a17-a11f-405e-accc-9f0ba3624a24
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0c77a17-a11f-405e-accc-9f0ba3624a24
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

{"id":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d7c0b6ef3c99","qa-6e6a6699ce7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.821480265Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-8ae7836f-d184-4d6e-a6c0-71f566dcb7bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae7836f-d184-4d6e-a6c0-71f566dcb7bd
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ae7836f-d184-4d6e-a6c0-71f566dcb7bd
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

{"id":"msg_26e54c4f-2f2c-4e0d-9879-772ec86f7565","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-6e6a6699ce7c","body":"Sure, now works","createdAt":"2026-11-07T08:55:04.330463519Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-4f45f17d-57b2-4352-9841-671de6ea1979

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f45f17d-57b2-4352-9841-671de6ea1979
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f45f17d-57b2-4352-9841-671de6ea1979
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

{"id":"msg_1e0bff6c-cf7b-4100-92f4-6b2d9f296211","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-6e6a6699ce7c","body":"Calling you","createdAt":"2026-11-07T08:55:04.373562193Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461
correlation: qa-f4565717-86b9-443a-9c56-eec9d5be2ce2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4565717-86b9-443a-9c56-eec9d5be2ce2
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4565717-86b9-443a-9c56-eec9d5be2ce2
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

{"id":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","subject":"Project kickoff","status":"open","region":"us","participants":["qa-d7c0b6ef3c99","qa-6e6a6699ce7c"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-07T08:55:03.821480265Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-7f937770-f204-4bde-b664-336664b3c39b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f937770-f204-4bde-b664-336664b3c39b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f937770-f204-4bde-b664-336664b3c39b
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

{"items":[{"id":"msg_dc1e1317-5407-4d4a-b8f7-faee0011d2a1","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-d7c0b6ef3c99","body":"Hi Ben, got a minute?","createdAt":"2026-11-07T08:55:03.821516272Z"},{"id":"msg_26e54c4f-2f2c-4e0d-9879-772ec86f7565","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-6e6a6699ce7c","body":"Sure, now works","createdAt":"2026-11-07T08:55:04.330463519Z"},{"id":"msg_1e0bff6c-cf7b-4100-92f4-6b2d9f296211","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-6e6a6699ce7c","body":"Calling you","createdAt":"2026-11-07T08:55:04.373562193Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-8ca20ef9-e565-48b9-93e9-7d8cdfad055c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ca20ef9-e565-48b9-93e9-7d8cdfad055c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ca20ef9-e565-48b9-93e9-7d8cdfad055c
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

{"balance":4,"currency":"credits","accountId":"acc_35930dd9-f4d3-4dab-9bc3-296d02008791"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-b4addea3-4ad0-4e1a-b941-12a8946c45e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4addea3-4ad0-4e1a-b941-12a8946c45e1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4addea3-4ad0-4e1a-b941-12a8946c45e1
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

{"balance":3,"currency":"credits","accountId":"acc_a13f9ea7-e6e9-4d14-a2b3-5e9ab82fc4e9"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-4363982b-dcef-4e68-8d3d-8aef8177be01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4363982b-dcef-4e68-8d3d-8aef8177be01
Content-Type: application/json

--- request body ---
{"handle":"qa-5dfb780f5b71","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4363982b-dcef-4e68-8d3d-8aef8177be01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5e03c5d-25b8-4abb-b245-dcec1c824edc"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461
correlation: qa-0fde8512-e5d3-4710-9f39-6933d678bc79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fde8512-e5d3-4710-9f39-6933d678bc79
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fde8512-e5d3-4710-9f39-6933d678bc79
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","correlationId":"qa-0fde8512-e5d3-4710-9f39-6933d678bc79"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-bc523668-462e-4ab5-bcf2-2af9c4552b4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc523668-462e-4ab5-bcf2-2af9c4552b4d
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc523668-462e-4ab5-bcf2-2af9c4552b4d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages","correlationId":"qa-bc523668-462e-4ab5-bcf2-2af9c4552b4d"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-6a97d7b2-1514-4af3-9815-a003d3ad7fdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a97d7b2-1514-4af3-9815-a003d3ad7fdc
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a97d7b2-1514-4af3-9815-a003d3ad7fdc
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages","correlationId":"qa-6a97d7b2-1514-4af3-9815-a003d3ad7fdc"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-a2038bf8-05eb-46be-8053-ec5c0d1fd61a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2038bf8-05eb-46be-8053-ec5c0d1fd61a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2038bf8-05eb-46be-8053-ec5c0d1fd61a
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
correlation: qa-7990931b-ae27-4cda-9133-17fbc114f902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7990931b-ae27-4cda-9133-17fbc114f902
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-7990931b-ae27-4cda-9133-17fbc114f902
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

{"balance":5,"currency":"credits","accountId":"acc_c5e03c5d-25b8-4abb-b245-dcec1c824edc"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/close
correlation: qa-c6d8183c-18f4-4a7e-9232-e959705b7811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d8183c-18f4-4a7e-9232-e959705b7811
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d8183c-18f4-4a7e-9232-e959705b7811
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

{"id":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-d7c0b6ef3c99","qa-6e6a6699ce7c"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-07T08:55:03.821480265Z","closedAt":"2026-11-07T08:55:05.399515096Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/close
correlation: qa-2b88af75-57b7-4b57-bd0b-4c309ad18176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b88af75-57b7-4b57-bd0b-4c309ad18176
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b88af75-57b7-4b57-bd0b-4c309ad18176
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

{"id":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-d7c0b6ef3c99","qa-6e6a6699ce7c"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-07T08:55:03.821480265Z","closedAt":"2026-11-07T08:55:05.399515096Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-ab47cfea-287c-4aae-b953-034f71f5972f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab47cfea-287c-4aae-b953-034f71f5972f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab47cfea-287c-4aae-b953-034f71f5972f
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

{"items":[{"id":"msg_dc1e1317-5407-4d4a-b8f7-faee0011d2a1","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-d7c0b6ef3c99","body":"Hi Ben, got a minute?","createdAt":"2026-11-07T08:55:03.821516272Z"},{"id":"msg_26e54c4f-2f2c-4e0d-9879-772ec86f7565","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-6e6a6699ce7c","body":"Sure, now works","createdAt":"2026-11-07T08:55:04.330463519Z"},{"id":"msg_1e0bff6c-cf7b-4100-92f4-6b2d9f296211","conversationId":"cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461","sender":"qa-6e6a6699ce7c","body":"Calling you","createdAt":"2026-11-07T08:55:04.373562193Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages
correlation: qa-70a33e6d-9f2c-4b91-b9b5-0b222a65bd47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a33e6d-9f2c-4b91-b9b5-0b222a65bd47
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70a33e6d-9f2c-4b91-b9b5-0b222a65bd47
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_f6bc242c-8d63-44e3-9a34-4f249fc09461/messages","correlationId":"qa-70a33e6d-9f2c-4b91-b9b5-0b222a65bd47"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-437a3db5-5f9a-4c75-abd8-eff314c18834

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-437a3db5-5f9a-4c75-abd8-eff314c18834
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-437a3db5-5f9a-4c75-abd8-eff314c18834
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

{"balance":3,"currency":"credits","accountId":"acc_a13f9ea7-e6e9-4d14-a2b3-5e9ab82fc4e9"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-989834fa-4138-410d-b053-1f7ae2a1d87e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-989834fa-4138-410d-b053-1f7ae2a1d87e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-989834fa-4138-410d-b053-1f7ae2a1d87e
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
correlation: qa-07707cd7-c973-4e56-8c0b-b054a765f93c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07707cd7-c973-4e56-8c0b-b054a765f93c
Content-Type: application/json

--- request body ---
{"handle":"qa-5dfb780f5b71","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07707cd7-c973-4e56-8c0b-b054a765f93c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-07707cd7-c973-4e56-8c0b-b054a765f93c"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98771f2e-7289-441f-847f-ef896787e142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98771f2e-7289-441f-847f-ef896787e142
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98771f2e-7289-441f-847f-ef896787e142
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
correlation: qa-a639f107-93fc-41ab-937e-43ee6ddc0ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a639f107-93fc-41ab-937e-43ee6ddc0ec6
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6a6699ce7c","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a639f107-93fc-41ab-937e-43ee6ddc0ec6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a639f107-93fc-41ab-937e-43ee6ddc0ec6"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8c03059-d9cc-402d-a14f-36c65c1ccb14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8c03059-d9cc-402d-a14f-36c65c1ccb14
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8c03059-d9cc-402d-a14f-36c65c1ccb14
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
correlation: qa-b5edae3f-e7d5-4ab2-851d-849a6620944d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5edae3f-e7d5-4ab2-851d-849a6620944d
Content-Type: application/json

--- request body ---
{"handle":"qa-d7c0b6ef3c99","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5edae3f-e7d5-4ab2-851d-849a6620944d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5edae3f-e7d5-4ab2-851d-849a6620944d"}
```
