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
| 1 | `POST /v1/accounts` | 201 | 332 | `qa-586ed606-1701-4e53-984a-4d230c38e00b` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-cf15c404-e489-4f1b-8f3e-defbbab83f5a` |
| 3 | `POST /v1/accounts` | 201 | 32 | `qa-6dd042dc-ed2f-4c29-bdc2-c052b8990e5b` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-b58d4bce-add5-4458-80ee-bc0442b4a22b` |
| 5 | `POST /v1/conversations` | 201 | 7 | `qa-934d6985-975e-499d-8ece-967584de811d` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-7d850a2d-9d8e-4867-a9b9-ee89a3808ff0` |
| 7 | `GET /v1/conversations` | 200 | 14 | `qa-459644dc-76c9-4b74-ba4f-d937d0624660` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-c79d90f7-6d52-4d85-97fc-03273860c673` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-cc371637-9542-4428-8f7b-31352466fc49` |
| 10 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-e2d30361-a45f-4adf-9bf1-bb90561a1b67` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-79dacf8d-acaf-4502-8857-cb1cec075a1c` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-f80c3796-319d-4423-b7d4-48ba5ee11c4e` |
| 13 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-289e27ce-ef52-42f5-8c7f-46fcff64b69e` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-915d37c1-87aa-4a09-b9aa-3215f19cbff2` |
| 15 | `GET /v1/credits/balance` | 200 | 10 | `qa-53fd4cbd-3d71-40b9-96d6-fb68830ae004` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-dd29c0e2-ec5b-400a-87e5-98c4f8d8018f` |
| 17 | `POST /v1/auth/token` | 200 | 8 | `qa-a6416ee4-3eeb-49d9-84d7-3e80311c2a3d` |
| 18 | `GET /v1/conversations/{id}` | 403 | 5 | `qa-e579d452-83e9-41cb-abc7-6f0e8404e902` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 6 | `qa-b1ed439c-a567-4180-9933-62ae70ecf575` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-e8a4a326-3d34-4698-aaf0-15f93de981ec` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-765e314a-c9a4-469a-bb9b-2aa527222f66` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-5582cfaf-f8ce-4acc-b7fd-de6bd63a5da4` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 4 | `qa-b9375e8a-f1ec-41bf-8c20-963c349beedc` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-fbc84c3f-325d-444b-9533-413d8a15da18` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-b3cd5e42-d7c1-4b3d-9180-8c148f35b825` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 4 | `qa-684cd4d9-850d-4709-960a-13fc2dcc9493` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-edc2d36c-95b0-4759-a6e7-ac7435659979` |
| 28 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2585158f-8ee3-4623-b2cf-64293b1d9279` |
| 29 | `POST /v1/auth/token` | 401 | 3 | `qa-ccb628d1-9204-463b-b8cc-78d0b24261fb` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-748fc901-2348-4e08-bf4f-c4b695789242` |
| 31 | `POST /v1/auth/token` | 401 | 3 | `qa-797f4fae-1820-4da5-93d7-04fbb4ceb579` |
| 32 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-4aa8ac76-119a-4b97-9ca4-fc8a5a1c11b6` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-c0857164-0dfb-42de-af69-609af82624a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-586ed606-1701-4e53-984a-4d230c38e00b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586ed606-1701-4e53-984a-4d230c38e00b
Content-Type: application/json

--- request body ---
{"handle":"qa-336ef67b0da8","displayName":"QA 336ef67b0da8","password":"****","region":"eu"}

--- response: 201 in 332 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-586ed606-1701-4e53-984a-4d230c38e00b
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
Location: /v1/accounts/qa-336ef67b0da8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f258da0-1e0c-4ed0-8ca1-1342fdb96ff3","handle":"qa-336ef67b0da8","displayName":"QA 336ef67b0da8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:33.402333934Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cf15c404-e489-4f1b-8f3e-defbbab83f5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf15c404-e489-4f1b-8f3e-defbbab83f5a
Content-Type: application/json

--- request body ---
{"handle":"qa-c76c6dde2636","displayName":"QA c76c6dde2636","password":"****","region":"us"}

--- response: 201 in 38 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf15c404-e489-4f1b-8f3e-defbbab83f5a
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
Location: /v1/accounts/qa-c76c6dde2636
X-Served-Region: us
Content-Length: 181

{"id":"acc_ab42fc67-3016-491d-bb66-3c3ddcfe9c77","handle":"qa-c76c6dde2636","displayName":"QA c76c6dde2636","region":"us","role":"user","createdAt":"2026-11-10T09:59:33.705763899Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6dd042dc-ed2f-4c29-bdc2-c052b8990e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd042dc-ed2f-4c29-bdc2-c052b8990e5b
Content-Type: application/json

--- request body ---
{"handle":"qa-3f322eaffa14","displayName":"QA 3f322eaffa14","password":"****","region":"in"}

--- response: 201 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd042dc-ed2f-4c29-bdc2-c052b8990e5b
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
Location: /v1/accounts/qa-3f322eaffa14
X-Served-Region: in
Content-Length: 181

{"id":"acc_7e550b4f-194c-41f7-bb82-3c00c207398d","handle":"qa-3f322eaffa14","displayName":"QA 3f322eaffa14","region":"in","role":"user","createdAt":"2026-11-10T09:59:33.775422782Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b58d4bce-add5-4458-80ee-bc0442b4a22b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b58d4bce-add5-4458-80ee-bc0442b4a22b
Content-Type: application/json

--- request body ---
{"handle":"qa-336ef67b0da8","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b58d4bce-add5-4458-80ee-bc0442b4a22b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f258da0-1e0c-4ed0-8ca1-1342fdb96ff3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-934d6985-975e-499d-8ece-967584de811d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-934d6985-975e-499d-8ece-967584de811d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c76c6dde2636","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-934d6985-975e-499d-8ece-967584de811d
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
Location: /v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925
X-Data-Region: us
Content-Length: 238

{"id":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","subject":"Project kickoff","status":"open","region":"us","participants":["qa-336ef67b0da8","qa-c76c6dde2636"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:33.854862064Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7d850a2d-9d8e-4867-a9b9-ee89a3808ff0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d850a2d-9d8e-4867-a9b9-ee89a3808ff0
Content-Type: application/json

--- request body ---
{"handle":"qa-c76c6dde2636","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d850a2d-9d8e-4867-a9b9-ee89a3808ff0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab42fc67-3016-491d-bb66-3c3ddcfe9c77"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-459644dc-76c9-4b74-ba4f-d937d0624660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-459644dc-76c9-4b74-ba4f-d937d0624660
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-459644dc-76c9-4b74-ba4f-d937d0624660
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

{"items":[{"id":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","subject":"Project kickoff","status":"open","region":"us","participants":["qa-336ef67b0da8","qa-c76c6dde2636"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-10T09:59:33.854862064Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-c79d90f7-6d52-4d85-97fc-03273860c673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c79d90f7-6d52-4d85-97fc-03273860c673
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c79d90f7-6d52-4d85-97fc-03273860c673
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

{"items":[{"id":"msg_568d35b9-3a01-4398-98cb-75fab42b5e49","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-336ef67b0da8","body":"Hi Ben, got a minute?","createdAt":"2026-11-10T09:59:33.854880812Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/read
correlation: qa-cc371637-9542-4428-8f7b-31352466fc49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc371637-9542-4428-8f7b-31352466fc49
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc371637-9542-4428-8f7b-31352466fc49
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

{"conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925
correlation: qa-e2d30361-a45f-4adf-9bf1-bb90561a1b67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d30361-a45f-4adf-9bf1-bb90561a1b67
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2d30361-a45f-4adf-9bf1-bb90561a1b67
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

{"id":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","subject":"Project kickoff","status":"open","region":"us","participants":["qa-336ef67b0da8","qa-c76c6dde2636"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:33.854862064Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-79dacf8d-acaf-4502-8857-cb1cec075a1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79dacf8d-acaf-4502-8857-cb1cec075a1c
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-79dacf8d-acaf-4502-8857-cb1cec075a1c
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

{"id":"msg_dff0cbbc-7d16-44b3-9be3-caf38235219c","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-c76c6dde2636","body":"Sure, now works","createdAt":"2026-11-10T09:59:34.114023249Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-f80c3796-319d-4423-b7d4-48ba5ee11c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f80c3796-319d-4423-b7d4-48ba5ee11c4e
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f80c3796-319d-4423-b7d4-48ba5ee11c4e
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
Content-Length: 199

{"id":"msg_be639bb7-eefb-49a7-b641-6c791d7bfb5f","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-c76c6dde2636","body":"Calling you","createdAt":"2026-11-10T09:59:34.132304Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925
correlation: qa-289e27ce-ef52-42f5-8c7f-46fcff64b69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-289e27ce-ef52-42f5-8c7f-46fcff64b69e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-289e27ce-ef52-42f5-8c7f-46fcff64b69e
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

{"id":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","subject":"Project kickoff","status":"open","region":"us","participants":["qa-336ef67b0da8","qa-c76c6dde2636"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-10T09:59:33.854862064Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-915d37c1-87aa-4a09-b9aa-3215f19cbff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-915d37c1-87aa-4a09-b9aa-3215f19cbff2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-915d37c1-87aa-4a09-b9aa-3215f19cbff2
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
Content-Length: 641

{"items":[{"id":"msg_568d35b9-3a01-4398-98cb-75fab42b5e49","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-336ef67b0da8","body":"Hi Ben, got a minute?","createdAt":"2026-11-10T09:59:33.854880812Z"},{"id":"msg_dff0cbbc-7d16-44b3-9be3-caf38235219c","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-c76c6dde2636","body":"Sure, now works","createdAt":"2026-11-10T09:59:34.114023249Z"},{"id":"msg_be639bb7-eefb-49a7-b641-6c791d7bfb5f","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-c76c6dde2636","body":"Calling you","createdAt":"2026-11-10T09:59:34.132304Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-53fd4cbd-3d71-40b9-96d6-fb68830ae004

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53fd4cbd-3d71-40b9-96d6-fb68830ae004
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-53fd4cbd-3d71-40b9-96d6-fb68830ae004
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

{"balance":4,"currency":"credits","accountId":"acc_1f258da0-1e0c-4ed0-8ca1-1342fdb96ff3"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-dd29c0e2-ec5b-400a-87e5-98c4f8d8018f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd29c0e2-ec5b-400a-87e5-98c4f8d8018f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd29c0e2-ec5b-400a-87e5-98c4f8d8018f
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

{"balance":3,"currency":"credits","accountId":"acc_ab42fc67-3016-491d-bb66-3c3ddcfe9c77"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-a6416ee4-3eeb-49d9-84d7-3e80311c2a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6416ee4-3eeb-49d9-84d7-3e80311c2a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-3f322eaffa14","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6416ee4-3eeb-49d9-84d7-3e80311c2a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e550b4f-194c-41f7-bb82-3c00c207398d"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925
correlation: qa-e579d452-83e9-41cb-abc7-6f0e8404e902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e579d452-83e9-41cb-abc7-6f0e8404e902
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e579d452-83e9-41cb-abc7-6f0e8404e902
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","correlationId":"qa-e579d452-83e9-41cb-abc7-6f0e8404e902"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-b1ed439c-a567-4180-9933-62ae70ecf575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1ed439c-a567-4180-9933-62ae70ecf575
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1ed439c-a567-4180-9933-62ae70ecf575
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages","correlationId":"qa-b1ed439c-a567-4180-9933-62ae70ecf575"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-e8a4a326-3d34-4698-aaf0-15f93de981ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a4a326-3d34-4698-aaf0-15f93de981ec
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8a4a326-3d34-4698-aaf0-15f93de981ec
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages","correlationId":"qa-e8a4a326-3d34-4698-aaf0-15f93de981ec"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-765e314a-c9a4-469a-bb9b-2aa527222f66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-765e314a-c9a4-469a-bb9b-2aa527222f66
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-765e314a-c9a4-469a-bb9b-2aa527222f66
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
correlation: qa-5582cfaf-f8ce-4acc-b7fd-de6bd63a5da4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5582cfaf-f8ce-4acc-b7fd-de6bd63a5da4
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5582cfaf-f8ce-4acc-b7fd-de6bd63a5da4
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

{"balance":5,"currency":"credits","accountId":"acc_7e550b4f-194c-41f7-bb82-3c00c207398d"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/close
correlation: qa-b9375e8a-f1ec-41bf-8c20-963c349beedc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9375e8a-f1ec-41bf-8c20-963c349beedc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9375e8a-f1ec-41bf-8c20-963c349beedc
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

{"id":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-336ef67b0da8","qa-c76c6dde2636"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-10T09:59:33.854862064Z","closedAt":"2026-11-10T09:59:34.761199728Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/close
correlation: qa-fbc84c3f-325d-444b-9533-413d8a15da18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc84c3f-325d-444b-9533-413d8a15da18
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbc84c3f-325d-444b-9533-413d8a15da18
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

{"id":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-336ef67b0da8","qa-c76c6dde2636"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-10T09:59:33.854862064Z","closedAt":"2026-11-10T09:59:34.761199728Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-b3cd5e42-d7c1-4b3d-9180-8c148f35b825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3cd5e42-d7c1-4b3d-9180-8c148f35b825
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3cd5e42-d7c1-4b3d-9180-8c148f35b825
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
Content-Length: 641

{"items":[{"id":"msg_568d35b9-3a01-4398-98cb-75fab42b5e49","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-336ef67b0da8","body":"Hi Ben, got a minute?","createdAt":"2026-11-10T09:59:33.854880812Z"},{"id":"msg_dff0cbbc-7d16-44b3-9be3-caf38235219c","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-c76c6dde2636","body":"Sure, now works","createdAt":"2026-11-10T09:59:34.114023249Z"},{"id":"msg_be639bb7-eefb-49a7-b641-6c791d7bfb5f","conversationId":"cnv_fd21a701-7406-4f52-ae10-381e5ffa5925","sender":"qa-c76c6dde2636","body":"Calling you","createdAt":"2026-11-10T09:59:34.132304Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages
correlation: qa-684cd4d9-850d-4709-960a-13fc2dcc9493

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-684cd4d9-850d-4709-960a-13fc2dcc9493
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-684cd4d9-850d-4709-960a-13fc2dcc9493
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_fd21a701-7406-4f52-ae10-381e5ffa5925/messages","correlationId":"qa-684cd4d9-850d-4709-960a-13fc2dcc9493"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-edc2d36c-95b0-4759-a6e7-ac7435659979

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edc2d36c-95b0-4759-a6e7-ac7435659979
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-edc2d36c-95b0-4759-a6e7-ac7435659979
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

{"balance":3,"currency":"credits","accountId":"acc_ab42fc67-3016-491d-bb66-3c3ddcfe9c77"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2585158f-8ee3-4623-b2cf-64293b1d9279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2585158f-8ee3-4623-b2cf-64293b1d9279
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2585158f-8ee3-4623-b2cf-64293b1d9279
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
correlation: qa-ccb628d1-9204-463b-b8cc-78d0b24261fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb628d1-9204-463b-b8cc-78d0b24261fb
Content-Type: application/json

--- request body ---
{"handle":"qa-3f322eaffa14","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccb628d1-9204-463b-b8cc-78d0b24261fb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccb628d1-9204-463b-b8cc-78d0b24261fb"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-748fc901-2348-4e08-bf4f-c4b695789242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-748fc901-2348-4e08-bf4f-c4b695789242
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-748fc901-2348-4e08-bf4f-c4b695789242
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
correlation: qa-797f4fae-1820-4da5-93d7-04fbb4ceb579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-797f4fae-1820-4da5-93d7-04fbb4ceb579
Content-Type: application/json

--- request body ---
{"handle":"qa-c76c6dde2636","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-797f4fae-1820-4da5-93d7-04fbb4ceb579
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-797f4fae-1820-4da5-93d7-04fbb4ceb579"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4aa8ac76-119a-4b97-9ca4-fc8a5a1c11b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aa8ac76-119a-4b97-9ca4-fc8a5a1c11b6
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4aa8ac76-119a-4b97-9ca4-fc8a5a1c11b6
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
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-c0857164-0dfb-42de-af69-609af82624a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0857164-0dfb-42de-af69-609af82624a5
Content-Type: application/json

--- request body ---
{"handle":"qa-336ef67b0da8","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0857164-0dfb-42de-af69-609af82624a5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0857164-0dfb-42de-af69-609af82624a5"}
```
