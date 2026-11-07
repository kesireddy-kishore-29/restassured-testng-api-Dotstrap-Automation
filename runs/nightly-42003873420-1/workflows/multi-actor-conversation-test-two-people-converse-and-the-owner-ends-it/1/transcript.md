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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-16f5ba13-3c69-4187-8e1e-fe9788a108c1` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-0bbbd3d6-3fcc-4ee5-a33f-5759ed6570fb` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-a8e606d2-3e7b-4926-b1b4-2d46257fc4e9` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-d110d781-3cd4-4bfc-914c-89cbd4e8926b` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-1f60221c-3b80-4f43-b7d1-2c67095b965e` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-518a97d0-3a62-4866-86fe-a3b0aa6ea5f7` |
| 7 | `GET /v1/conversations` | 200 | 21 | `qa-5bafa3c0-07f5-49df-aa80-6ab1ab9b72c5` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-55f17adf-6d1a-436e-b6d3-5a94a8a55e0b` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-dddd3566-7aa7-435e-a536-374b508e23ed` |
| 10 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-ea396399-0ede-4e17-9fc7-47bd551c63cd` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-2d368bf1-f8f1-4f95-8190-57c97ca9825d` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-25bfd8c5-9e60-4968-9ec6-91903daf7d07` |
| 13 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-be718a12-a0e6-4508-aa6c-293d0d23af86` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-2fa66263-3dd8-44cb-bdd9-2c0f226f1b91` |
| 15 | `GET /v1/credits/balance` | 200 | 6 | `qa-896f733b-8d61-4568-929b-7accbb863bfb` |
| 16 | `GET /v1/credits/balance` | 200 | 6 | `qa-ce34a156-676a-49e6-9c03-b2e93e132ff9` |
| 17 | `POST /v1/auth/token` | 200 | 12 | `qa-2eb27611-c95d-4069-aeb4-640fa672a6be` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-5658f52b-2040-4f80-9adc-555007769a59` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-3da02210-98bd-44ec-8a67-0ce695b42f6e` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-e2f41309-f515-48d2-bdb9-a25c6ae832c6` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-1d7fcad1-08c7-41d3-8f61-149f031e1ade` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-592cf443-d8c4-4b1f-8ccf-d3d255720c15` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-c29c93e0-05b9-49aa-a70b-b2e2fa1c4fe7` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-9dbbe066-09b0-4cef-b145-7d419112750b` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-72f1cfc2-4fb6-4661-a00b-8ce07f661b19` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 7 | `qa-58b6b872-7439-471c-9aba-4788ceee4dc8` |
| 27 | `GET /v1/credits/balance` | 200 | 6 | `qa-bbabf174-94d0-4a25-ae6c-d6706fa436cb` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7e7f2838-e34b-4023-90f3-ce624a602496` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-35389217-2454-4586-84e8-3fabe02fa603` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-04bddd47-fdf9-44aa-8a90-4b7526df7bf6` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-5be874b1-366e-4d99-84e5-facb8dc17894` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-61d4450d-ec4a-4150-aa69-55c39e634e5e` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-517728c4-b59b-49fd-82dd-ec99b15b52f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-16f5ba13-3c69-4187-8e1e-fe9788a108c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f5ba13-3c69-4187-8e1e-fe9788a108c1
Content-Type: application/json

--- request body ---
{"handle":"qa-903e3372f4e9","displayName":"QA 903e3372f4e9","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-16f5ba13-3c69-4187-8e1e-fe9788a108c1
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
Location: /v1/accounts/qa-903e3372f4e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_401940d4-bb51-4541-b587-0b2808fa0201","handle":"qa-903e3372f4e9","displayName":"QA 903e3372f4e9","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.446776147Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0bbbd3d6-3fcc-4ee5-a33f-5759ed6570fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bbbd3d6-3fcc-4ee5-a33f-5759ed6570fb
Content-Type: application/json

--- request body ---
{"handle":"qa-779d7ad4de8e","displayName":"QA 779d7ad4de8e","password":"****","region":"us"}

--- response: 201 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bbbd3d6-3fcc-4ee5-a33f-5759ed6570fb
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
Location: /v1/accounts/qa-779d7ad4de8e
X-Served-Region: us
Content-Length: 181

{"id":"acc_2b0caab9-6091-4028-8e1b-7d55358ad45c","handle":"qa-779d7ad4de8e","displayName":"QA 779d7ad4de8e","region":"us","role":"user","createdAt":"2026-11-05T09:37:57.474168463Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a8e606d2-3e7b-4926-b1b4-2d46257fc4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e606d2-3e7b-4926-b1b4-2d46257fc4e9
Content-Type: application/json

--- request body ---
{"handle":"qa-9cec51d34a83","displayName":"QA 9cec51d34a83","password":"****","region":"in"}

--- response: 201 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8e606d2-3e7b-4926-b1b4-2d46257fc4e9
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
Location: /v1/accounts/qa-9cec51d34a83
X-Served-Region: in
Content-Length: 181

{"id":"acc_aaa0a345-e0c6-4a20-9eb5-abaedd849b98","handle":"qa-9cec51d34a83","displayName":"QA 9cec51d34a83","region":"in","role":"user","createdAt":"2026-11-05T09:37:57.523310828Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d110d781-3cd4-4bfc-914c-89cbd4e8926b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d110d781-3cd4-4bfc-914c-89cbd4e8926b
Content-Type: application/json

--- request body ---
{"handle":"qa-903e3372f4e9","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d110d781-3cd4-4bfc-914c-89cbd4e8926b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_401940d4-bb51-4541-b587-0b2808fa0201"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1f60221c-3b80-4f43-b7d1-2c67095b965e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f60221c-3b80-4f43-b7d1-2c67095b965e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-779d7ad4de8e","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f60221c-3b80-4f43-b7d1-2c67095b965e
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
Location: /v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444
X-Data-Region: us
Content-Length: 238

{"id":"cnv_19628ed0-f508-4264-95d3-99540b021444","subject":"Project kickoff","status":"open","region":"us","participants":["qa-903e3372f4e9","qa-779d7ad4de8e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.598730612Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-518a97d0-3a62-4866-86fe-a3b0aa6ea5f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-518a97d0-3a62-4866-86fe-a3b0aa6ea5f7
Content-Type: application/json

--- request body ---
{"handle":"qa-779d7ad4de8e","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-518a97d0-3a62-4866-86fe-a3b0aa6ea5f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b0caab9-6091-4028-8e1b-7d55358ad45c"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-5bafa3c0-07f5-49df-aa80-6ab1ab9b72c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bafa3c0-07f5-49df-aa80-6ab1ab9b72c5
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bafa3c0-07f5-49df-aa80-6ab1ab9b72c5
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

{"items":[{"id":"cnv_19628ed0-f508-4264-95d3-99540b021444","subject":"Project kickoff","status":"open","region":"us","participants":["qa-903e3372f4e9","qa-779d7ad4de8e"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-05T09:37:57.598730612Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-55f17adf-6d1a-436e-b6d3-5a94a8a55e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55f17adf-6d1a-436e-b6d3-5a94a8a55e0b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-55f17adf-6d1a-436e-b6d3-5a94a8a55e0b
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

{"items":[{"id":"msg_3881087c-6ff7-43a0-aab4-6ec69299326a","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-903e3372f4e9","body":"Hi Ben, got a minute?","createdAt":"2026-11-05T09:37:57.598755899Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/read
correlation: qa-dddd3566-7aa7-435e-a536-374b508e23ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dddd3566-7aa7-435e-a536-374b508e23ed
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dddd3566-7aa7-435e-a536-374b508e23ed
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

{"conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444
correlation: qa-ea396399-0ede-4e17-9fc7-47bd551c63cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea396399-0ede-4e17-9fc7-47bd551c63cd
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea396399-0ede-4e17-9fc7-47bd551c63cd
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

{"id":"cnv_19628ed0-f508-4264-95d3-99540b021444","subject":"Project kickoff","status":"open","region":"us","participants":["qa-903e3372f4e9","qa-779d7ad4de8e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.598730612Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-2d368bf1-f8f1-4f95-8190-57c97ca9825d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d368bf1-f8f1-4f95-8190-57c97ca9825d
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d368bf1-f8f1-4f95-8190-57c97ca9825d
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

{"id":"msg_76d6c0cb-a219-4814-9be7-4c400ad5fc93","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-779d7ad4de8e","body":"Sure, now works","createdAt":"2026-11-05T09:37:57.789147905Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-25bfd8c5-9e60-4968-9ec6-91903daf7d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25bfd8c5-9e60-4968-9ec6-91903daf7d07
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-25bfd8c5-9e60-4968-9ec6-91903daf7d07
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

{"id":"msg_31587259-ab04-4de8-bd60-66994783660f","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-779d7ad4de8e","body":"Calling you","createdAt":"2026-11-05T09:37:57.811121979Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444
correlation: qa-be718a12-a0e6-4508-aa6c-293d0d23af86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be718a12-a0e6-4508-aa6c-293d0d23af86
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-be718a12-a0e6-4508-aa6c-293d0d23af86
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

{"id":"cnv_19628ed0-f508-4264-95d3-99540b021444","subject":"Project kickoff","status":"open","region":"us","participants":["qa-903e3372f4e9","qa-779d7ad4de8e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-05T09:37:57.598730612Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-2fa66263-3dd8-44cb-bdd9-2c0f226f1b91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa66263-3dd8-44cb-bdd9-2c0f226f1b91
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa66263-3dd8-44cb-bdd9-2c0f226f1b91
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

{"items":[{"id":"msg_3881087c-6ff7-43a0-aab4-6ec69299326a","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-903e3372f4e9","body":"Hi Ben, got a minute?","createdAt":"2026-11-05T09:37:57.598755899Z"},{"id":"msg_76d6c0cb-a219-4814-9be7-4c400ad5fc93","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-779d7ad4de8e","body":"Sure, now works","createdAt":"2026-11-05T09:37:57.789147905Z"},{"id":"msg_31587259-ab04-4de8-bd60-66994783660f","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-779d7ad4de8e","body":"Calling you","createdAt":"2026-11-05T09:37:57.811121979Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-896f733b-8d61-4568-929b-7accbb863bfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-896f733b-8d61-4568-929b-7accbb863bfb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-896f733b-8d61-4568-929b-7accbb863bfb
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

{"balance":4,"currency":"credits","accountId":"acc_401940d4-bb51-4541-b587-0b2808fa0201"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-ce34a156-676a-49e6-9c03-b2e93e132ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce34a156-676a-49e6-9c03-b2e93e132ff9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce34a156-676a-49e6-9c03-b2e93e132ff9
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

{"balance":3,"currency":"credits","accountId":"acc_2b0caab9-6091-4028-8e1b-7d55358ad45c"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-2eb27611-c95d-4069-aeb4-640fa672a6be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eb27611-c95d-4069-aeb4-640fa672a6be
Content-Type: application/json

--- request body ---
{"handle":"qa-9cec51d34a83","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb27611-c95d-4069-aeb4-640fa672a6be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aaa0a345-e0c6-4a20-9eb5-abaedd849b98"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444
correlation: qa-5658f52b-2040-4f80-9adc-555007769a59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5658f52b-2040-4f80-9adc-555007769a59
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5658f52b-2040-4f80-9adc-555007769a59
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444","correlationId":"qa-5658f52b-2040-4f80-9adc-555007769a59"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-3da02210-98bd-44ec-8a67-0ce695b42f6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da02210-98bd-44ec-8a67-0ce695b42f6e
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3da02210-98bd-44ec-8a67-0ce695b42f6e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages","correlationId":"qa-3da02210-98bd-44ec-8a67-0ce695b42f6e"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-e2f41309-f515-48d2-bdb9-a25c6ae832c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f41309-f515-48d2-bdb9-a25c6ae832c6
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2f41309-f515-48d2-bdb9-a25c6ae832c6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages","correlationId":"qa-e2f41309-f515-48d2-bdb9-a25c6ae832c6"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-1d7fcad1-08c7-41d3-8f61-149f031e1ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7fcad1-08c7-41d3-8f61-149f031e1ade
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d7fcad1-08c7-41d3-8f61-149f031e1ade
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
correlation: qa-592cf443-d8c4-4b1f-8ccf-d3d255720c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-592cf443-d8c4-4b1f-8ccf-d3d255720c15
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-592cf443-d8c4-4b1f-8ccf-d3d255720c15
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

{"balance":5,"currency":"credits","accountId":"acc_aaa0a345-e0c6-4a20-9eb5-abaedd849b98"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/close
correlation: qa-c29c93e0-05b9-49aa-a70b-b2e2fa1c4fe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c29c93e0-05b9-49aa-a70b-b2e2fa1c4fe7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c29c93e0-05b9-49aa-a70b-b2e2fa1c4fe7
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
Content-Length: 284

{"id":"cnv_19628ed0-f508-4264-95d3-99540b021444","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-903e3372f4e9","qa-779d7ad4de8e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-05T09:37:57.598730612Z","closedAt":"2026-11-05T09:37:58.502260838Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/close
correlation: qa-9dbbe066-09b0-4cef-b145-7d419112750b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dbbe066-09b0-4cef-b145-7d419112750b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dbbe066-09b0-4cef-b145-7d419112750b
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
Content-Length: 284

{"id":"cnv_19628ed0-f508-4264-95d3-99540b021444","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-903e3372f4e9","qa-779d7ad4de8e"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-05T09:37:57.598730612Z","closedAt":"2026-11-05T09:37:58.502260838Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-72f1cfc2-4fb6-4661-a00b-8ce07f661b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72f1cfc2-4fb6-4661-a00b-8ce07f661b19
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-72f1cfc2-4fb6-4661-a00b-8ce07f661b19
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

{"items":[{"id":"msg_3881087c-6ff7-43a0-aab4-6ec69299326a","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-903e3372f4e9","body":"Hi Ben, got a minute?","createdAt":"2026-11-05T09:37:57.598755899Z"},{"id":"msg_76d6c0cb-a219-4814-9be7-4c400ad5fc93","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-779d7ad4de8e","body":"Sure, now works","createdAt":"2026-11-05T09:37:57.789147905Z"},{"id":"msg_31587259-ab04-4de8-bd60-66994783660f","conversationId":"cnv_19628ed0-f508-4264-95d3-99540b021444","sender":"qa-779d7ad4de8e","body":"Calling you","createdAt":"2026-11-05T09:37:57.811121979Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages
correlation: qa-58b6b872-7439-471c-9aba-4788ceee4dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b6b872-7439-471c-9aba-4788ceee4dc8
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58b6b872-7439-471c-9aba-4788ceee4dc8
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_19628ed0-f508-4264-95d3-99540b021444/messages","correlationId":"qa-58b6b872-7439-471c-9aba-4788ceee4dc8"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-bbabf174-94d0-4a25-ae6c-d6706fa436cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbabf174-94d0-4a25-ae6c-d6706fa436cb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbabf174-94d0-4a25-ae6c-d6706fa436cb
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

{"balance":3,"currency":"credits","accountId":"acc_2b0caab9-6091-4028-8e1b-7d55358ad45c"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e7f2838-e34b-4023-90f3-ce624a602496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e7f2838-e34b-4023-90f3-ce624a602496
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e7f2838-e34b-4023-90f3-ce624a602496
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
correlation: qa-35389217-2454-4586-84e8-3fabe02fa603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35389217-2454-4586-84e8-3fabe02fa603
Content-Type: application/json

--- request body ---
{"handle":"qa-9cec51d34a83","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35389217-2454-4586-84e8-3fabe02fa603
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35389217-2454-4586-84e8-3fabe02fa603"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04bddd47-fdf9-44aa-8a90-4b7526df7bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04bddd47-fdf9-44aa-8a90-4b7526df7bf6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04bddd47-fdf9-44aa-8a90-4b7526df7bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-5be874b1-366e-4d99-84e5-facb8dc17894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be874b1-366e-4d99-84e5-facb8dc17894
Content-Type: application/json

--- request body ---
{"handle":"qa-779d7ad4de8e","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5be874b1-366e-4d99-84e5-facb8dc17894
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5be874b1-366e-4d99-84e5-facb8dc17894"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61d4450d-ec4a-4150-aa69-55c39e634e5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d4450d-ec4a-4150-aa69-55c39e634e5e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61d4450d-ec4a-4150-aa69-55c39e634e5e
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
correlation: qa-517728c4-b59b-49fd-82dd-ec99b15b52f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-517728c4-b59b-49fd-82dd-ec99b15b52f3
Content-Type: application/json

--- request body ---
{"handle":"qa-903e3372f4e9","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-517728c4-b59b-49fd-82dd-ec99b15b52f3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-517728c4-b59b-49fd-82dd-ec99b15b52f3"}
```
