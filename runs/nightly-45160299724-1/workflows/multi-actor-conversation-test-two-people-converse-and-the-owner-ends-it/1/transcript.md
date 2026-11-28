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
| 1 | `POST /v1/accounts` | 201 | 421 | `qa-19dbc937-bcb7-49e0-ae50-c25baf83c092` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-df63a416-d057-49dd-9dc4-faacc6789c14` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-a20e20e2-ce71-471a-ad48-73f0171d550a` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-6e5085dd-bcd2-4133-b683-bc500b8f2b9c` |
| 5 | `POST /v1/conversations` | 201 | 30 | `qa-a04c123c-bb03-4901-92ee-c03ab70c39e1` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-2f103e75-7a51-495d-bcea-942f5a403147` |
| 7 | `GET /v1/conversations` | 200 | 28 | `qa-83b4b378-255c-4a08-a859-58fbaf804f53` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 24 | `qa-2a97ad28-84e9-4eca-98e7-2555e730a5a0` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 28 | `qa-3ab4cc70-7b32-4bde-bd9a-ce35d337a519` |
| 10 | `GET /v1/conversations/{id}` | 200 | 29 | `qa-91a287b2-c99e-437d-a079-1bb65305494a` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-906cddd0-701e-47a6-a2ff-c2e464154db5` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-3c6e9f4a-b1c9-459d-ad77-880dbb369c22` |
| 13 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-a61f00b0-8090-499c-a820-8ab2015a8cd7` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-db06268c-59c4-4168-a6e0-e463bb4cbb7b` |
| 15 | `GET /v1/credits/balance` | 200 | 9 | `qa-a9e6b8f2-3950-4f42-909e-459b62f228b1` |
| 16 | `GET /v1/credits/balance` | 200 | 13 | `qa-55b181fb-201b-4f22-b91b-8780e538b58c` |
| 17 | `POST /v1/auth/token` | 200 | 20 | `qa-4c7ef3e2-39d7-4e7b-85a3-4117e3a299bc` |
| 18 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-b75af649-7b1b-4695-83f9-2cb250fea8aa` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-da0572c5-6d9f-44ef-b94c-420b99bd9670` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-150d1870-fcb5-40b6-a43d-a156ad2da7b7` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-dc4c5e00-00cd-4637-a75b-fc003be12e81` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-2b87884b-a2fe-4d68-8f38-6db98ed01fbf` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 9 | `qa-3d13dc34-8d6e-4a26-9af6-76db5c43e211` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-f98a1bfb-3688-4ccc-939e-3047dd68aa38` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-1ce19ba7-fd38-4414-b06f-e0ba480660f2` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-8ef91e87-cfb5-46a2-9bea-c05906771a8b` |
| 27 | `GET /v1/credits/balance` | 200 | 9 | `qa-a029a6d6-363b-403e-8452-e81c91fcd446` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-80818488-d896-4e29-b9fb-4efe575ab4d6` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-cbd4d178-3618-4d0e-9596-c0fa384b567e` |
| 30 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b6b7f742-b666-4109-b315-9b75a9c9c71d` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-1245ac06-b598-4881-bc18-73541ec7c005` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-67a1d4bb-5239-414b-b8d7-0db73dacca9a` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-48c81474-0049-49c8-818f-4e8552b24f68` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19dbc937-bcb7-49e0-ae50-c25baf83c092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19dbc937-bcb7-49e0-ae50-c25baf83c092
Content-Type: application/json

--- request body ---
{"handle":"qa-40f9e8be5b17","displayName":"QA 40f9e8be5b17","password":"****","region":"eu"}

--- response: 201 in 421 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-19dbc937-bcb7-49e0-ae50-c25baf83c092
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
Location: /v1/accounts/qa-40f9e8be5b17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95ec8a85-89f0-467f-af86-7aab40de70fa","handle":"qa-40f9e8be5b17","displayName":"QA 40f9e8be5b17","region":"eu","role":"user","createdAt":"2026-11-23T10:55:04.223199244Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-df63a416-d057-49dd-9dc4-faacc6789c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df63a416-d057-49dd-9dc4-faacc6789c14
Content-Type: application/json

--- request body ---
{"handle":"qa-d6cf5e04eeea","displayName":"QA d6cf5e04eeea","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-df63a416-d057-49dd-9dc4-faacc6789c14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-d6cf5e04eeea
X-Served-Region: us
Content-Length: 181

{"id":"acc_3ed68cc3-c502-475b-9baf-ac228dd6d7b8","handle":"qa-d6cf5e04eeea","displayName":"QA d6cf5e04eeea","region":"us","role":"user","createdAt":"2026-11-23T10:55:04.630748832Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a20e20e2-ce71-471a-ad48-73f0171d550a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a20e20e2-ce71-471a-ad48-73f0171d550a
Content-Type: application/json

--- request body ---
{"handle":"qa-50d60ebdbdd2","displayName":"QA 50d60ebdbdd2","password":"****","region":"in"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a20e20e2-ce71-471a-ad48-73f0171d550a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-50d60ebdbdd2
X-Served-Region: in
Content-Length: 181

{"id":"acc_7d1c5b2c-198d-4fd2-a495-9bf3dcf2e1e6","handle":"qa-50d60ebdbdd2","displayName":"QA 50d60ebdbdd2","region":"in","role":"user","createdAt":"2026-11-23T10:55:04.686970071Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6e5085dd-bcd2-4133-b683-bc500b8f2b9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5085dd-bcd2-4133-b683-bc500b8f2b9c
Content-Type: application/json

--- request body ---
{"handle":"qa-40f9e8be5b17","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e5085dd-bcd2-4133-b683-bc500b8f2b9c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95ec8a85-89f0-467f-af86-7aab40de70fa"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a04c123c-bb03-4901-92ee-c03ab70c39e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a04c123c-bb03-4901-92ee-c03ab70c39e1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d6cf5e04eeea","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 30 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a04c123c-bb03-4901-92ee-c03ab70c39e1
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
Location: /v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce
X-Data-Region: us
Content-Length: 238

{"id":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","subject":"Project kickoff","status":"open","region":"us","participants":["qa-40f9e8be5b17","qa-d6cf5e04eeea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:04.797774198Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f103e75-7a51-495d-bcea-942f5a403147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f103e75-7a51-495d-bcea-942f5a403147
Content-Type: application/json

--- request body ---
{"handle":"qa-d6cf5e04eeea","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f103e75-7a51-495d-bcea-942f5a403147
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ed68cc3-c502-475b-9baf-ac228dd6d7b8"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-83b4b378-255c-4a08-a859-58fbaf804f53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83b4b378-255c-4a08-a859-58fbaf804f53
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-83b4b378-255c-4a08-a859-58fbaf804f53
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

{"items":[{"id":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","subject":"Project kickoff","status":"open","region":"us","participants":["qa-40f9e8be5b17","qa-d6cf5e04eeea"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-23T10:55:04.797774198Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-2a97ad28-84e9-4eca-98e7-2555e730a5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a97ad28-84e9-4eca-98e7-2555e730a5a0
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a97ad28-84e9-4eca-98e7-2555e730a5a0
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

{"items":[{"id":"msg_c216f513-d3b5-4ef2-a8a6-6fa3563abb9d","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-40f9e8be5b17","body":"Hi Ben, got a minute?","createdAt":"2026-11-23T10:55:04.797785767Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/read
correlation: qa-3ab4cc70-7b32-4bde-bd9a-ce35d337a519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ab4cc70-7b32-4bde-bd9a-ce35d337a519
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ab4cc70-7b32-4bde-bd9a-ce35d337a519
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

{"conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce
correlation: qa-91a287b2-c99e-437d-a079-1bb65305494a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a287b2-c99e-437d-a079-1bb65305494a
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-91a287b2-c99e-437d-a079-1bb65305494a
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

{"id":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","subject":"Project kickoff","status":"open","region":"us","participants":["qa-40f9e8be5b17","qa-d6cf5e04eeea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:04.797774198Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-906cddd0-701e-47a6-a2ff-c2e464154db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-906cddd0-701e-47a6-a2ff-c2e464154db5
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-906cddd0-701e-47a6-a2ff-c2e464154db5
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

{"id":"msg_49156399-a218-4a4e-91ad-6736bc295686","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-d6cf5e04eeea","body":"Sure, now works","createdAt":"2026-11-23T10:55:05.375292033Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-3c6e9f4a-b1c9-459d-ad77-880dbb369c22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c6e9f4a-b1c9-459d-ad77-880dbb369c22
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c6e9f4a-b1c9-459d-ad77-880dbb369c22
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

{"id":"msg_acb1e8cd-2443-4908-8a58-87db0b03ad7b","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-d6cf5e04eeea","body":"Calling you","createdAt":"2026-11-23T10:55:05.399953820Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce
correlation: qa-a61f00b0-8090-499c-a820-8ab2015a8cd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a61f00b0-8090-499c-a820-8ab2015a8cd7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a61f00b0-8090-499c-a820-8ab2015a8cd7
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

{"id":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","subject":"Project kickoff","status":"open","region":"us","participants":["qa-40f9e8be5b17","qa-d6cf5e04eeea"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-23T10:55:04.797774198Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-db06268c-59c4-4168-a6e0-e463bb4cbb7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db06268c-59c4-4168-a6e0-e463bb4cbb7b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-db06268c-59c4-4168-a6e0-e463bb4cbb7b
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

{"items":[{"id":"msg_c216f513-d3b5-4ef2-a8a6-6fa3563abb9d","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-40f9e8be5b17","body":"Hi Ben, got a minute?","createdAt":"2026-11-23T10:55:04.797785767Z"},{"id":"msg_49156399-a218-4a4e-91ad-6736bc295686","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-d6cf5e04eeea","body":"Sure, now works","createdAt":"2026-11-23T10:55:05.375292033Z"},{"id":"msg_acb1e8cd-2443-4908-8a58-87db0b03ad7b","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-d6cf5e04eeea","body":"Calling you","createdAt":"2026-11-23T10:55:05.399953820Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-a9e6b8f2-3950-4f42-909e-459b62f228b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e6b8f2-3950-4f42-909e-459b62f228b1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9e6b8f2-3950-4f42-909e-459b62f228b1
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

{"balance":4,"currency":"credits","accountId":"acc_95ec8a85-89f0-467f-af86-7aab40de70fa"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-55b181fb-201b-4f22-b91b-8780e538b58c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55b181fb-201b-4f22-b91b-8780e538b58c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-55b181fb-201b-4f22-b91b-8780e538b58c
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

{"balance":3,"currency":"credits","accountId":"acc_3ed68cc3-c502-475b-9baf-ac228dd6d7b8"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-4c7ef3e2-39d7-4e7b-85a3-4117e3a299bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c7ef3e2-39d7-4e7b-85a3-4117e3a299bc
Content-Type: application/json

--- request body ---
{"handle":"qa-50d60ebdbdd2","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c7ef3e2-39d7-4e7b-85a3-4117e3a299bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d1c5b2c-198d-4fd2-a495-9bf3dcf2e1e6"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce
correlation: qa-b75af649-7b1b-4695-83f9-2cb250fea8aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b75af649-7b1b-4695-83f9-2cb250fea8aa
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b75af649-7b1b-4695-83f9-2cb250fea8aa
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","correlationId":"qa-b75af649-7b1b-4695-83f9-2cb250fea8aa"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-da0572c5-6d9f-44ef-b94c-420b99bd9670

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da0572c5-6d9f-44ef-b94c-420b99bd9670
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da0572c5-6d9f-44ef-b94c-420b99bd9670
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages","correlationId":"qa-da0572c5-6d9f-44ef-b94c-420b99bd9670"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-150d1870-fcb5-40b6-a43d-a156ad2da7b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150d1870-fcb5-40b6-a43d-a156ad2da7b7
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-150d1870-fcb5-40b6-a43d-a156ad2da7b7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages","correlationId":"qa-150d1870-fcb5-40b6-a43d-a156ad2da7b7"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-dc4c5e00-00cd-4637-a75b-fc003be12e81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc4c5e00-00cd-4637-a75b-fc003be12e81
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc4c5e00-00cd-4637-a75b-fc003be12e81
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
correlation: qa-2b87884b-a2fe-4d68-8f38-6db98ed01fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b87884b-a2fe-4d68-8f38-6db98ed01fbf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b87884b-a2fe-4d68-8f38-6db98ed01fbf
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

{"balance":5,"currency":"credits","accountId":"acc_7d1c5b2c-198d-4fd2-a495-9bf3dcf2e1e6"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/close
correlation: qa-3d13dc34-8d6e-4a26-9af6-76db5c43e211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d13dc34-8d6e-4a26-9af6-76db5c43e211
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d13dc34-8d6e-4a26-9af6-76db5c43e211
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

{"id":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-40f9e8be5b17","qa-d6cf5e04eeea"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-23T10:55:04.797774198Z","closedAt":"2026-11-23T10:55:06.067061572Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/close
correlation: qa-f98a1bfb-3688-4ccc-939e-3047dd68aa38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f98a1bfb-3688-4ccc-939e-3047dd68aa38
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f98a1bfb-3688-4ccc-939e-3047dd68aa38
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

{"id":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-40f9e8be5b17","qa-d6cf5e04eeea"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-23T10:55:04.797774198Z","closedAt":"2026-11-23T10:55:06.067061572Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-1ce19ba7-fd38-4414-b06f-e0ba480660f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ce19ba7-fd38-4414-b06f-e0ba480660f2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ce19ba7-fd38-4414-b06f-e0ba480660f2
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
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_c216f513-d3b5-4ef2-a8a6-6fa3563abb9d","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-40f9e8be5b17","body":"Hi Ben, got a minute?","createdAt":"2026-11-23T10:55:04.797785767Z"},{"id":"msg_49156399-a218-4a4e-91ad-6736bc295686","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-d6cf5e04eeea","body":"Sure, now works","createdAt":"2026-11-23T10:55:05.375292033Z"},{"id":"msg_acb1e8cd-2443-4908-8a58-87db0b03ad7b","conversationId":"cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce","sender":"qa-d6cf5e04eeea","body":"Calling you","createdAt":"2026-11-23T10:55:05.399953820Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages
correlation: qa-8ef91e87-cfb5-46a2-9bea-c05906771a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ef91e87-cfb5-46a2-9bea-c05906771a8b
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ef91e87-cfb5-46a2-9bea-c05906771a8b
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
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_a592ff41-de39-42d3-94e5-8916f28cb9ce/messages","correlationId":"qa-8ef91e87-cfb5-46a2-9bea-c05906771a8b"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-a029a6d6-363b-403e-8452-e81c91fcd446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a029a6d6-363b-403e-8452-e81c91fcd446
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a029a6d6-363b-403e-8452-e81c91fcd446
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_3ed68cc3-c502-475b-9baf-ac228dd6d7b8"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80818488-d896-4e29-b9fb-4efe575ab4d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80818488-d896-4e29-b9fb-4efe575ab4d6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80818488-d896-4e29-b9fb-4efe575ab4d6
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
correlation: qa-cbd4d178-3618-4d0e-9596-c0fa384b567e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbd4d178-3618-4d0e-9596-c0fa384b567e
Content-Type: application/json

--- request body ---
{"handle":"qa-50d60ebdbdd2","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbd4d178-3618-4d0e-9596-c0fa384b567e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbd4d178-3618-4d0e-9596-c0fa384b567e"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6b7f742-b666-4109-b315-9b75a9c9c71d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6b7f742-b666-4109-b315-9b75a9c9c71d
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6b7f742-b666-4109-b315-9b75a9c9c71d
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
correlation: qa-1245ac06-b598-4881-bc18-73541ec7c005

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1245ac06-b598-4881-bc18-73541ec7c005
Content-Type: application/json

--- request body ---
{"handle":"qa-d6cf5e04eeea","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1245ac06-b598-4881-bc18-73541ec7c005
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1245ac06-b598-4881-bc18-73541ec7c005"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-67a1d4bb-5239-414b-b8d7-0db73dacca9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a1d4bb-5239-414b-b8d7-0db73dacca9a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-67a1d4bb-5239-414b-b8d7-0db73dacca9a
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
correlation: qa-48c81474-0049-49c8-818f-4e8552b24f68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48c81474-0049-49c8-818f-4e8552b24f68
Content-Type: application/json

--- request body ---
{"handle":"qa-40f9e8be5b17","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48c81474-0049-49c8-818f-4e8552b24f68
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48c81474-0049-49c8-818f-4e8552b24f68"}
```
