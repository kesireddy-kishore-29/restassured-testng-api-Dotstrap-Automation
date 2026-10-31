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
| 1 | `POST /v1/accounts` | 201 | 304 | `qa-26ad908c-2475-45c3-b309-d51d920893ba` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-7cee0cd9-2e6e-4617-88b6-4783bafb4090` |
| 3 | `POST /v1/accounts` | 201 | 34 | `qa-85832ee8-1c1d-475c-b80c-99909c305647` |
| 4 | `POST /v1/auth/token` | 200 | 9 | `qa-47da4346-27b5-4f73-9e0c-3ef08820fdf0` |
| 5 | `POST /v1/conversations` | 201 | 64 | `qa-12db18e0-73fe-4393-9077-bf135d2c537a` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-f8a291ff-0b6b-4996-bd8d-0ccfd3c6f867` |
| 7 | `GET /v1/conversations` | 200 | 12 | `qa-72efc0bb-4fa6-4228-ae8e-d3a3d6a77a73` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-12bdb901-3ce1-4a8a-af03-8354f3c24218` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 16 | `qa-56bcf48f-5761-4dde-8894-f483a26cf061` |
| 10 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-6b14df29-f7fc-4f64-bc4f-c801eed3d15b` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-e2befa35-48fd-4539-ba37-8d58c9a03898` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-ece5c9c8-8f21-4f45-91a1-fc3a5cdd2372` |
| 13 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-de32324c-3b74-4052-929a-3612ae33d4e9` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-44ead651-9b90-4bca-9521-d9ea69ed76a7` |
| 15 | `GET /v1/credits/balance` | 200 | 12 | `qa-624dcdb4-7f5b-4720-af7e-4fabb0a5d354` |
| 16 | `GET /v1/credits/balance` | 200 | 8 | `qa-5c0a6a44-afc6-403e-a380-cef56df9896a` |
| 17 | `POST /v1/auth/token` | 200 | 17 | `qa-3fa3cc65-34cd-4321-8514-eb4712f2e092` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-0f3b700d-e053-453f-80b7-1a7d58ee81a6` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-ae5293b8-5ed2-43d6-9da0-f84e66798783` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-130ca002-2567-44ff-8d2f-1bd5800aacd8` |
| 21 | `GET /v1/conversations` | 200 | 5 | `qa-3ba68fb5-cd98-4743-84cd-8bdd11c34831` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-c3e680e3-5237-469f-bf62-0ba013c95183` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-72fc4094-13df-4d5d-b49c-263ce954ead7` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-dac0a97f-ef62-4deb-9b7e-8353b8c6ed34` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-122cf320-6d5c-47b6-bc84-1193063adced` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 4 | `qa-72e14d15-5ed4-4894-baea-40eff2044292` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-8da3b708-1c97-42fb-96bb-b8e28388d78c` |
| 28 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b1ed01aa-6b1b-40fd-a134-65dc0b5b7099` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-ed66be4e-c913-4376-bc1d-4e6b33a260b8` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-a940b3e0-4f4b-4dec-8a86-9a8a03bf3c2f` |
| 31 | `POST /v1/auth/token` | 401 | 3 | `qa-1c182fc3-4917-40d5-94e0-fe189e26cb76` |
| 32 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-6366c4f6-cc98-4712-a629-86f30af451fb` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-da0575e1-5663-4e25-a271-b1de6a1f320c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26ad908c-2475-45c3-b309-d51d920893ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ad908c-2475-45c3-b309-d51d920893ba
Content-Type: application/json

--- request body ---
{"handle":"qa-4c134d114363","displayName":"QA 4c134d114363","password":"****","region":"eu"}

--- response: 201 in 304 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-26ad908c-2475-45c3-b309-d51d920893ba
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
Location: /v1/accounts/qa-4c134d114363
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89cbec50-08c9-43b7-a1ae-88f58767388e","handle":"qa-4c134d114363","displayName":"QA 4c134d114363","region":"eu","role":"user","createdAt":"2026-10-28T08:42:54.765362898Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7cee0cd9-2e6e-4617-88b6-4783bafb4090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cee0cd9-2e6e-4617-88b6-4783bafb4090
Content-Type: application/json

--- request body ---
{"handle":"qa-99e63e7017de","displayName":"QA 99e63e7017de","password":"****","region":"us"}

--- response: 201 in 54 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cee0cd9-2e6e-4617-88b6-4783bafb4090
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-99e63e7017de
X-Served-Region: us
Content-Length: 181

{"id":"acc_f30a5ed5-45bf-4c2d-a8d3-0e69dc765663","handle":"qa-99e63e7017de","displayName":"QA 99e63e7017de","region":"us","role":"user","createdAt":"2026-10-28T08:42:55.074835356Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-85832ee8-1c1d-475c-b80c-99909c305647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85832ee8-1c1d-475c-b80c-99909c305647
Content-Type: application/json

--- request body ---
{"handle":"qa-29f3c315b94a","displayName":"QA 29f3c315b94a","password":"****","region":"in"}

--- response: 201 in 34 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-85832ee8-1c1d-475c-b80c-99909c305647
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
Location: /v1/accounts/qa-29f3c315b94a
X-Served-Region: in
Content-Length: 181

{"id":"acc_888f3dd6-1da6-4bde-9be6-fd425cfdf2f1","handle":"qa-29f3c315b94a","displayName":"QA 29f3c315b94a","region":"in","role":"user","createdAt":"2026-10-28T08:42:55.154091359Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-47da4346-27b5-4f73-9e0c-3ef08820fdf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47da4346-27b5-4f73-9e0c-3ef08820fdf0
Content-Type: application/json

--- request body ---
{"handle":"qa-4c134d114363","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-47da4346-27b5-4f73-9e0c-3ef08820fdf0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89cbec50-08c9-43b7-a1ae-88f58767388e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-12db18e0-73fe-4393-9077-bf135d2c537a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12db18e0-73fe-4393-9077-bf135d2c537a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-99e63e7017de","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 64 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-12db18e0-73fe-4393-9077-bf135d2c537a
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
Location: /v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e
X-Data-Region: us
Content-Length: 238

{"id":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4c134d114363","qa-99e63e7017de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:55.243352145Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f8a291ff-0b6b-4996-bd8d-0ccfd3c6f867

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8a291ff-0b6b-4996-bd8d-0ccfd3c6f867
Content-Type: application/json

--- request body ---
{"handle":"qa-99e63e7017de","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8a291ff-0b6b-4996-bd8d-0ccfd3c6f867
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f30a5ed5-45bf-4c2d-a8d3-0e69dc765663"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-72efc0bb-4fa6-4228-ae8e-d3a3d6a77a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72efc0bb-4fa6-4228-ae8e-d3a3d6a77a73
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-72efc0bb-4fa6-4228-ae8e-d3a3d6a77a73
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

{"items":[{"id":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4c134d114363","qa-99e63e7017de"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-28T08:42:55.243352145Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-12bdb901-3ce1-4a8a-af03-8354f3c24218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12bdb901-3ce1-4a8a-af03-8354f3c24218
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-12bdb901-3ce1-4a8a-af03-8354f3c24218
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

{"items":[{"id":"msg_c7e9f4d6-53f7-444d-b0ab-d16eab5088dd","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-4c134d114363","body":"Hi Ben, got a minute?","createdAt":"2026-10-28T08:42:55.243387037Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/read
correlation: qa-56bcf48f-5761-4dde-8894-f483a26cf061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56bcf48f-5761-4dde-8894-f483a26cf061
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-56bcf48f-5761-4dde-8894-f483a26cf061
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

{"conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e
correlation: qa-6b14df29-f7fc-4f64-bc4f-c801eed3d15b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b14df29-f7fc-4f64-bc4f-c801eed3d15b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b14df29-f7fc-4f64-bc4f-c801eed3d15b
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

{"id":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4c134d114363","qa-99e63e7017de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:55.243352145Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-e2befa35-48fd-4539-ba37-8d58c9a03898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2befa35-48fd-4539-ba37-8d58c9a03898
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2befa35-48fd-4539-ba37-8d58c9a03898
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

{"id":"msg_a4b01b69-e37b-42b8-ac9a-81d121e5b906","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-99e63e7017de","body":"Sure, now works","createdAt":"2026-10-28T08:42:55.616090170Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-ece5c9c8-8f21-4f45-91a1-fc3a5cdd2372

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ece5c9c8-8f21-4f45-91a1-fc3a5cdd2372
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ece5c9c8-8f21-4f45-91a1-fc3a5cdd2372
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

{"id":"msg_ba1cb670-b5f9-45ef-a156-2ca0b761a684","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-99e63e7017de","body":"Calling you","createdAt":"2026-10-28T08:42:55.643490487Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e
correlation: qa-de32324c-3b74-4052-929a-3612ae33d4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de32324c-3b74-4052-929a-3612ae33d4e9
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-de32324c-3b74-4052-929a-3612ae33d4e9
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

{"id":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","subject":"Project kickoff","status":"open","region":"us","participants":["qa-4c134d114363","qa-99e63e7017de"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-28T08:42:55.243352145Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-44ead651-9b90-4bca-9521-d9ea69ed76a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ead651-9b90-4bca-9521-d9ea69ed76a7
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-44ead651-9b90-4bca-9521-d9ea69ed76a7
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

{"items":[{"id":"msg_c7e9f4d6-53f7-444d-b0ab-d16eab5088dd","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-4c134d114363","body":"Hi Ben, got a minute?","createdAt":"2026-10-28T08:42:55.243387037Z"},{"id":"msg_a4b01b69-e37b-42b8-ac9a-81d121e5b906","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-99e63e7017de","body":"Sure, now works","createdAt":"2026-10-28T08:42:55.616090170Z"},{"id":"msg_ba1cb670-b5f9-45ef-a156-2ca0b761a684","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-99e63e7017de","body":"Calling you","createdAt":"2026-10-28T08:42:55.643490487Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-624dcdb4-7f5b-4720-af7e-4fabb0a5d354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-624dcdb4-7f5b-4720-af7e-4fabb0a5d354
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-624dcdb4-7f5b-4720-af7e-4fabb0a5d354
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

{"balance":4,"currency":"credits","accountId":"acc_89cbec50-08c9-43b7-a1ae-88f58767388e"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-5c0a6a44-afc6-403e-a380-cef56df9896a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c0a6a44-afc6-403e-a380-cef56df9896a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c0a6a44-afc6-403e-a380-cef56df9896a
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

{"balance":3,"currency":"credits","accountId":"acc_f30a5ed5-45bf-4c2d-a8d3-0e69dc765663"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-3fa3cc65-34cd-4321-8514-eb4712f2e092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fa3cc65-34cd-4321-8514-eb4712f2e092
Content-Type: application/json

--- request body ---
{"handle":"qa-29f3c315b94a","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fa3cc65-34cd-4321-8514-eb4712f2e092
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_888f3dd6-1da6-4bde-9be6-fd425cfdf2f1"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e
correlation: qa-0f3b700d-e053-453f-80b7-1a7d58ee81a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3b700d-e053-453f-80b7-1a7d58ee81a6
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f3b700d-e053-453f-80b7-1a7d58ee81a6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e","correlationId":"qa-0f3b700d-e053-453f-80b7-1a7d58ee81a6"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-ae5293b8-5ed2-43d6-9da0-f84e66798783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae5293b8-5ed2-43d6-9da0-f84e66798783
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae5293b8-5ed2-43d6-9da0-f84e66798783
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages","correlationId":"qa-ae5293b8-5ed2-43d6-9da0-f84e66798783"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-130ca002-2567-44ff-8d2f-1bd5800aacd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-130ca002-2567-44ff-8d2f-1bd5800aacd8
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-130ca002-2567-44ff-8d2f-1bd5800aacd8
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages","correlationId":"qa-130ca002-2567-44ff-8d2f-1bd5800aacd8"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-3ba68fb5-cd98-4743-84cd-8bdd11c34831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ba68fb5-cd98-4743-84cd-8bdd11c34831
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ba68fb5-cd98-4743-84cd-8bdd11c34831
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
correlation: qa-c3e680e3-5237-469f-bf62-0ba013c95183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e680e3-5237-469f-bf62-0ba013c95183
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3e680e3-5237-469f-bf62-0ba013c95183
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

{"balance":5,"currency":"credits","accountId":"acc_888f3dd6-1da6-4bde-9be6-fd425cfdf2f1"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/close
correlation: qa-72fc4094-13df-4d5d-b49c-263ce954ead7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72fc4094-13df-4d5d-b49c-263ce954ead7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-72fc4094-13df-4d5d-b49c-263ce954ead7
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

{"id":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-4c134d114363","qa-99e63e7017de"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-28T08:42:55.243352145Z","closedAt":"2026-10-28T08:42:56.422874189Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/close
correlation: qa-dac0a97f-ef62-4deb-9b7e-8353b8c6ed34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dac0a97f-ef62-4deb-9b7e-8353b8c6ed34
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-dac0a97f-ef62-4deb-9b7e-8353b8c6ed34
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

{"id":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-4c134d114363","qa-99e63e7017de"],"messageCount":3,"unreadCount":2,"createdAt":"2026-10-28T08:42:55.243352145Z","closedAt":"2026-10-28T08:42:56.422874189Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-122cf320-6d5c-47b6-bc84-1193063adced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-122cf320-6d5c-47b6-bc84-1193063adced
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-122cf320-6d5c-47b6-bc84-1193063adced
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

{"items":[{"id":"msg_c7e9f4d6-53f7-444d-b0ab-d16eab5088dd","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-4c134d114363","body":"Hi Ben, got a minute?","createdAt":"2026-10-28T08:42:55.243387037Z"},{"id":"msg_a4b01b69-e37b-42b8-ac9a-81d121e5b906","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-99e63e7017de","body":"Sure, now works","createdAt":"2026-10-28T08:42:55.616090170Z"},{"id":"msg_ba1cb670-b5f9-45ef-a156-2ca0b761a684","conversationId":"cnv_6c03d25c-a402-472e-bbf0-205e849a984e","sender":"qa-99e63e7017de","body":"Calling you","createdAt":"2026-10-28T08:42:55.643490487Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages
correlation: qa-72e14d15-5ed4-4894-baea-40eff2044292

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e14d15-5ed4-4894-baea-40eff2044292
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72e14d15-5ed4-4894-baea-40eff2044292
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_6c03d25c-a402-472e-bbf0-205e849a984e/messages","correlationId":"qa-72e14d15-5ed4-4894-baea-40eff2044292"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-8da3b708-1c97-42fb-96bb-b8e28388d78c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da3b708-1c97-42fb-96bb-b8e28388d78c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8da3b708-1c97-42fb-96bb-b8e28388d78c
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

{"balance":3,"currency":"credits","accountId":"acc_f30a5ed5-45bf-4c2d-a8d3-0e69dc765663"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b1ed01aa-6b1b-40fd-a134-65dc0b5b7099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1ed01aa-6b1b-40fd-a134-65dc0b5b7099
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b1ed01aa-6b1b-40fd-a134-65dc0b5b7099
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
correlation: qa-ed66be4e-c913-4376-bc1d-4e6b33a260b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed66be4e-c913-4376-bc1d-4e6b33a260b8
Content-Type: application/json

--- request body ---
{"handle":"qa-29f3c315b94a","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed66be4e-c913-4376-bc1d-4e6b33a260b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed66be4e-c913-4376-bc1d-4e6b33a260b8"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a940b3e0-4f4b-4dec-8a86-9a8a03bf3c2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a940b3e0-4f4b-4dec-8a86-9a8a03bf3c2f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a940b3e0-4f4b-4dec-8a86-9a8a03bf3c2f
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
correlation: qa-1c182fc3-4917-40d5-94e0-fe189e26cb76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c182fc3-4917-40d5-94e0-fe189e26cb76
Content-Type: application/json

--- request body ---
{"handle":"qa-99e63e7017de","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c182fc3-4917-40d5-94e0-fe189e26cb76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c182fc3-4917-40d5-94e0-fe189e26cb76"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6366c4f6-cc98-4712-a629-86f30af451fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6366c4f6-cc98-4712-a629-86f30af451fb
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6366c4f6-cc98-4712-a629-86f30af451fb
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
correlation: qa-da0575e1-5663-4e25-a271-b1de6a1f320c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da0575e1-5663-4e25-a271-b1de6a1f320c
Content-Type: application/json

--- request body ---
{"handle":"qa-4c134d114363","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da0575e1-5663-4e25-a271-b1de6a1f320c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da0575e1-5663-4e25-a271-b1de6a1f320c"}
```
