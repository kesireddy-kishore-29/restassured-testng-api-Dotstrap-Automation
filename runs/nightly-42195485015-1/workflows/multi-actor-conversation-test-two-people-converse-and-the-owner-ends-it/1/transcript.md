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
| 1 | `POST /v1/accounts` | 201 | 474 | `qa-9cbe3260-7c53-4887-bdba-687a0a1a23ca` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-ee20834e-b3ee-4be5-b473-993fdd0754fa` |
| 3 | `POST /v1/accounts` | 201 | 43 | `qa-f46a22b7-aacd-4130-8d7c-8073dc9e40bc` |
| 4 | `POST /v1/auth/token` | 200 | 51 | `qa-0f0f73f3-5240-4585-be98-717d7d55b20d` |
| 5 | `POST /v1/conversations` | 201 | 59 | `qa-aaabdb14-cdf0-417f-bd9b-b8aeeb345b36` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-9300f467-f2a0-4aa0-adcf-711c8f7947d6` |
| 7 | `GET /v1/conversations` | 200 | 36 | `qa-5194b4aa-5b08-4401-a08c-cb28019659ab` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-04a49a29-8430-4fdc-a289-8fd5c73dd789` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 15 | `qa-eb2a2dd3-6838-42ac-8bc3-e80407feb248` |
| 10 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-36e462ca-6d52-428e-84b1-9d329b2d9a3e` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-f61ba897-df21-47e7-9383-b570c199f3b0` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-55ec811f-35a6-4a92-8367-87de47574dee` |
| 13 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-22bf4de4-056c-42db-95c1-796987dfd7b7` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-693d4105-873d-43ce-9cac-44a761dd53e6` |
| 15 | `GET /v1/credits/balance` | 200 | 9 | `qa-075ee2db-8e4e-4fc9-bbdb-ad91d3a962c1` |
| 16 | `GET /v1/credits/balance` | 200 | 8 | `qa-185fdfc7-cc16-475a-bb02-2b3d858944be` |
| 17 | `POST /v1/auth/token` | 200 | 19 | `qa-e2291bef-49a8-49be-815c-bf1515d93fcd` |
| 18 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-0c58fec0-49d7-4f45-8b69-757d533b857b` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-f8c8dd8a-0db2-4218-8f9b-3cd3e615a99e` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-37425342-777c-44cd-9fcb-7cc56fb972ec` |
| 21 | `GET /v1/conversations` | 200 | 8 | `qa-8847ad33-9629-4a98-9d7d-133b97718c7d` |
| 22 | `GET /v1/credits/balance` | 200 | 7 | `qa-d3168f61-b86c-49d0-bbaa-23906f388c40` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-0cfc4176-a905-43a5-8edc-98b22625e3fc` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 7 | `qa-df83a415-e1ed-4995-a18b-9dd831840314` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-21501054-6de9-429b-8d1b-9a3c2c4dc0a0` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 8 | `qa-c3f1344f-e685-484f-9af8-a485e012be8e` |
| 27 | `GET /v1/credits/balance` | 200 | 7 | `qa-a1f943b1-8393-4e67-9128-3e484626a34e` |
| 28 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3a2e2974-983e-4e57-9396-7f799d0db0f1` |
| 29 | `POST /v1/auth/token` | 401 | 6 | `qa-eaabdcc6-8759-4244-87d8-01152577d8ab` |
| 30 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-1cb3b1d5-e235-406a-ba76-79f18be9ba89` |
| 31 | `POST /v1/auth/token` | 401 | 7 | `qa-66462cd6-bada-4b01-b227-6569475b6a39` |
| 32 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-68a9bacc-13f8-4743-80a8-ef9beb30c40e` |
| 33 | `POST /v1/auth/token` | 401 | 6 | `qa-f9761290-0463-49d1-9ba4-9f74e470a220` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9cbe3260-7c53-4887-bdba-687a0a1a23ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cbe3260-7c53-4887-bdba-687a0a1a23ca
Content-Type: application/json

--- request body ---
{"handle":"qa-442b79d6389c","displayName":"QA 442b79d6389c","password":"****","region":"eu"}

--- response: 201 in 474 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cbe3260-7c53-4887-bdba-687a0a1a23ca
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
Location: /v1/accounts/qa-442b79d6389c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8de3645b-3dd2-4ead-966d-db5312920895","handle":"qa-442b79d6389c","displayName":"QA 442b79d6389c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.036330725Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ee20834e-b3ee-4be5-b473-993fdd0754fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee20834e-b3ee-4be5-b473-993fdd0754fa
Content-Type: application/json

--- request body ---
{"handle":"qa-4939ae8f8b65","displayName":"QA 4939ae8f8b65","password":"****","region":"us"}

--- response: 201 in 56 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee20834e-b3ee-4be5-b473-993fdd0754fa
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
Location: /v1/accounts/qa-4939ae8f8b65
X-Served-Region: us
Content-Length: 181

{"id":"acc_da613864-86f2-4da4-8d1e-52ca15c90bb8","handle":"qa-4939ae8f8b65","displayName":"QA 4939ae8f8b65","region":"us","role":"user","createdAt":"2026-11-06T09:30:31.544159683Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f46a22b7-aacd-4130-8d7c-8073dc9e40bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46a22b7-aacd-4130-8d7c-8073dc9e40bc
Content-Type: application/json

--- request body ---
{"handle":"qa-9531a5749b49","displayName":"QA 9531a5749b49","password":"****","region":"in"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46a22b7-aacd-4130-8d7c-8073dc9e40bc
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
Location: /v1/accounts/qa-9531a5749b49
X-Served-Region: in
Content-Length: 181

{"id":"acc_1d83cf2b-a913-4232-bf1a-86105690e687","handle":"qa-9531a5749b49","displayName":"QA 9531a5749b49","region":"in","role":"user","createdAt":"2026-11-06T09:30:31.613200396Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0f0f73f3-5240-4585-be98-717d7d55b20d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0f73f3-5240-4585-be98-717d7d55b20d
Content-Type: application/json

--- request body ---
{"handle":"qa-442b79d6389c","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f0f73f3-5240-4585-be98-717d7d55b20d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8de3645b-3dd2-4ead-966d-db5312920895"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-aaabdb14-cdf0-417f-bd9b-b8aeeb345b36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaabdb14-cdf0-417f-bd9b-b8aeeb345b36
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4939ae8f8b65","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 59 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaabdb14-cdf0-417f-bd9b-b8aeeb345b36
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
Location: /v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527
X-Data-Region: us
Content-Length: 238

{"id":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","subject":"Project kickoff","status":"open","region":"us","participants":["qa-442b79d6389c","qa-4939ae8f8b65"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.816932362Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9300f467-f2a0-4aa0-adcf-711c8f7947d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9300f467-f2a0-4aa0-adcf-711c8f7947d6
Content-Type: application/json

--- request body ---
{"handle":"qa-4939ae8f8b65","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9300f467-f2a0-4aa0-adcf-711c8f7947d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da613864-86f2-4da4-8d1e-52ca15c90bb8"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-5194b4aa-5b08-4401-a08c-cb28019659ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5194b4aa-5b08-4401-a08c-cb28019659ab
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5194b4aa-5b08-4401-a08c-cb28019659ab
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

{"items":[{"id":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","subject":"Project kickoff","status":"open","region":"us","participants":["qa-442b79d6389c","qa-4939ae8f8b65"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-06T09:30:31.816932362Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-04a49a29-8430-4fdc-a289-8fd5c73dd789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04a49a29-8430-4fdc-a289-8fd5c73dd789
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-04a49a29-8430-4fdc-a289-8fd5c73dd789
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

{"items":[{"id":"msg_acf724aa-5740-435c-9793-2988b3adb8e3","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-442b79d6389c","body":"Hi Ben, got a minute?","createdAt":"2026-11-06T09:30:31.816966395Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/read
correlation: qa-eb2a2dd3-6838-42ac-8bc3-e80407feb248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2a2dd3-6838-42ac-8bc3-e80407feb248
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb2a2dd3-6838-42ac-8bc3-e80407feb248
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

{"conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527
correlation: qa-36e462ca-6d52-428e-84b1-9d329b2d9a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e462ca-6d52-428e-84b1-9d329b2d9a3e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-36e462ca-6d52-428e-84b1-9d329b2d9a3e
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

{"id":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","subject":"Project kickoff","status":"open","region":"us","participants":["qa-442b79d6389c","qa-4939ae8f8b65"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.816932362Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-f61ba897-df21-47e7-9383-b570c199f3b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61ba897-df21-47e7-9383-b570c199f3b0
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f61ba897-df21-47e7-9383-b570c199f3b0
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

{"id":"msg_167c1a33-4936-4151-9dd3-717fd1601c5d","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-4939ae8f8b65","body":"Sure, now works","createdAt":"2026-11-06T09:30:32.294158293Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-55ec811f-35a6-4a92-8367-87de47574dee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ec811f-35a6-4a92-8367-87de47574dee
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-55ec811f-35a6-4a92-8367-87de47574dee
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

{"id":"msg_104f0e9e-aabe-4d83-8307-41a1655abad1","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-4939ae8f8b65","body":"Calling you","createdAt":"2026-11-06T09:30:32.334920764Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527
correlation: qa-22bf4de4-056c-42db-95c1-796987dfd7b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22bf4de4-056c-42db-95c1-796987dfd7b7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-22bf4de4-056c-42db-95c1-796987dfd7b7
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

{"id":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","subject":"Project kickoff","status":"open","region":"us","participants":["qa-442b79d6389c","qa-4939ae8f8b65"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-06T09:30:31.816932362Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-693d4105-873d-43ce-9cac-44a761dd53e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-693d4105-873d-43ce-9cac-44a761dd53e6
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-693d4105-873d-43ce-9cac-44a761dd53e6
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

{"items":[{"id":"msg_acf724aa-5740-435c-9793-2988b3adb8e3","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-442b79d6389c","body":"Hi Ben, got a minute?","createdAt":"2026-11-06T09:30:31.816966395Z"},{"id":"msg_167c1a33-4936-4151-9dd3-717fd1601c5d","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-4939ae8f8b65","body":"Sure, now works","createdAt":"2026-11-06T09:30:32.294158293Z"},{"id":"msg_104f0e9e-aabe-4d83-8307-41a1655abad1","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-4939ae8f8b65","body":"Calling you","createdAt":"2026-11-06T09:30:32.334920764Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-075ee2db-8e4e-4fc9-bbdb-ad91d3a962c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-075ee2db-8e4e-4fc9-bbdb-ad91d3a962c1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-075ee2db-8e4e-4fc9-bbdb-ad91d3a962c1
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

{"balance":4,"currency":"credits","accountId":"acc_8de3645b-3dd2-4ead-966d-db5312920895"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-185fdfc7-cc16-475a-bb02-2b3d858944be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-185fdfc7-cc16-475a-bb02-2b3d858944be
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-185fdfc7-cc16-475a-bb02-2b3d858944be
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

{"balance":3,"currency":"credits","accountId":"acc_da613864-86f2-4da4-8d1e-52ca15c90bb8"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-e2291bef-49a8-49be-815c-bf1515d93fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2291bef-49a8-49be-815c-bf1515d93fcd
Content-Type: application/json

--- request body ---
{"handle":"qa-9531a5749b49","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2291bef-49a8-49be-815c-bf1515d93fcd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d83cf2b-a913-4232-bf1a-86105690e687"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527
correlation: qa-0c58fec0-49d7-4f45-8b69-757d533b857b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c58fec0-49d7-4f45-8b69-757d533b857b
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c58fec0-49d7-4f45-8b69-757d533b857b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","correlationId":"qa-0c58fec0-49d7-4f45-8b69-757d533b857b"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-f8c8dd8a-0db2-4218-8f9b-3cd3e615a99e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8c8dd8a-0db2-4218-8f9b-3cd3e615a99e
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8c8dd8a-0db2-4218-8f9b-3cd3e615a99e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages","correlationId":"qa-f8c8dd8a-0db2-4218-8f9b-3cd3e615a99e"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-37425342-777c-44cd-9fcb-7cc56fb972ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37425342-777c-44cd-9fcb-7cc56fb972ec
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37425342-777c-44cd-9fcb-7cc56fb972ec
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages","correlationId":"qa-37425342-777c-44cd-9fcb-7cc56fb972ec"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-8847ad33-9629-4a98-9d7d-133b97718c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8847ad33-9629-4a98-9d7d-133b97718c7d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8847ad33-9629-4a98-9d7d-133b97718c7d
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
correlation: qa-d3168f61-b86c-49d0-bbaa-23906f388c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3168f61-b86c-49d0-bbaa-23906f388c40
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3168f61-b86c-49d0-bbaa-23906f388c40
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

{"balance":5,"currency":"credits","accountId":"acc_1d83cf2b-a913-4232-bf1a-86105690e687"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/close
correlation: qa-0cfc4176-a905-43a5-8edc-98b22625e3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cfc4176-a905-43a5-8edc-98b22625e3fc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cfc4176-a905-43a5-8edc-98b22625e3fc
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

{"id":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-442b79d6389c","qa-4939ae8f8b65"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-06T09:30:31.816932362Z","closedAt":"2026-11-06T09:30:33.408248243Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/close
correlation: qa-df83a415-e1ed-4995-a18b-9dd831840314

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df83a415-e1ed-4995-a18b-9dd831840314
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-df83a415-e1ed-4995-a18b-9dd831840314
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

{"id":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-442b79d6389c","qa-4939ae8f8b65"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-06T09:30:31.816932362Z","closedAt":"2026-11-06T09:30:33.408248243Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-21501054-6de9-429b-8d1b-9a3c2c4dc0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21501054-6de9-429b-8d1b-9a3c2c4dc0a0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-21501054-6de9-429b-8d1b-9a3c2c4dc0a0
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

{"items":[{"id":"msg_acf724aa-5740-435c-9793-2988b3adb8e3","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-442b79d6389c","body":"Hi Ben, got a minute?","createdAt":"2026-11-06T09:30:31.816966395Z"},{"id":"msg_167c1a33-4936-4151-9dd3-717fd1601c5d","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-4939ae8f8b65","body":"Sure, now works","createdAt":"2026-11-06T09:30:32.294158293Z"},{"id":"msg_104f0e9e-aabe-4d83-8307-41a1655abad1","conversationId":"cnv_830ceafd-8699-4f2a-9574-f271d7b1f527","sender":"qa-4939ae8f8b65","body":"Calling you","createdAt":"2026-11-06T09:30:32.334920764Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages
correlation: qa-c3f1344f-e685-484f-9af8-a485e012be8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f1344f-e685-484f-9af8-a485e012be8e
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3f1344f-e685-484f-9af8-a485e012be8e
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_830ceafd-8699-4f2a-9574-f271d7b1f527/messages","correlationId":"qa-c3f1344f-e685-484f-9af8-a485e012be8e"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-a1f943b1-8393-4e67-9128-3e484626a34e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1f943b1-8393-4e67-9128-3e484626a34e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1f943b1-8393-4e67-9128-3e484626a34e
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

{"balance":3,"currency":"credits","accountId":"acc_da613864-86f2-4da4-8d1e-52ca15c90bb8"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a2e2974-983e-4e57-9396-7f799d0db0f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2e2974-983e-4e57-9396-7f799d0db0f1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a2e2974-983e-4e57-9396-7f799d0db0f1
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
correlation: qa-eaabdcc6-8759-4244-87d8-01152577d8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaabdcc6-8759-4244-87d8-01152577d8ab
Content-Type: application/json

--- request body ---
{"handle":"qa-9531a5749b49","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eaabdcc6-8759-4244-87d8-01152577d8ab
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eaabdcc6-8759-4244-87d8-01152577d8ab"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1cb3b1d5-e235-406a-ba76-79f18be9ba89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cb3b1d5-e235-406a-ba76-79f18be9ba89
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1cb3b1d5-e235-406a-ba76-79f18be9ba89
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
correlation: qa-66462cd6-bada-4b01-b227-6569475b6a39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66462cd6-bada-4b01-b227-6569475b6a39
Content-Type: application/json

--- request body ---
{"handle":"qa-4939ae8f8b65","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66462cd6-bada-4b01-b227-6569475b6a39
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66462cd6-bada-4b01-b227-6569475b6a39"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68a9bacc-13f8-4743-80a8-ef9beb30c40e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68a9bacc-13f8-4743-80a8-ef9beb30c40e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68a9bacc-13f8-4743-80a8-ef9beb30c40e
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
correlation: qa-f9761290-0463-49d1-9ba4-9f74e470a220

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9761290-0463-49d1-9ba4-9f74e470a220
Content-Type: application/json

--- request body ---
{"handle":"qa-442b79d6389c","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9761290-0463-49d1-9ba4-9f74e470a220
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9761290-0463-49d1-9ba4-9f74e470a220"}
```
