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
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-d135cbf8-93b5-4976-a8c1-5af4b54e1c5c` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-108f3a32-4c98-4b82-baa1-72b9bd0e3039` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-459684be-9fc9-43be-9ca4-cdc407cee7ab` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-b7550e8e-9f70-443f-a5d9-b414afc5ef44` |
| 5 | `POST /v1/conversations` | 201 | 25 | `qa-d46f9109-3c5a-4e26-8607-b7e3b189f3f1` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-0f1799b7-02f1-40db-9e0f-8f338b9aed03` |
| 7 | `GET /v1/conversations` | 200 | 44 | `qa-f7db083e-3885-4cef-a240-1dbfe178acee` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 41 | `qa-8cb822da-9909-4365-9b69-ffd41098506e` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 21 | `qa-8831f804-11a6-4a9f-bfb8-da65c7dc7dea` |
| 10 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-bf0da57d-fbdb-4071-8622-692b7ca5737e` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-d7c725ec-dc21-434c-99fb-5ef5d7238791` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-92216c4c-1891-4067-8d17-06b4b3f0f99b` |
| 13 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-3e36a353-1a09-4da8-8472-6decb1ff6e57` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-ac05dd00-638b-4711-8c46-2737bd268c51` |
| 15 | `GET /v1/credits/balance` | 200 | 14 | `qa-49de3783-3d5e-4991-b2b0-9d4f5c6ca793` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-2333a281-334b-454c-98f5-fff3caeebd0b` |
| 17 | `POST /v1/auth/token` | 200 | 9 | `qa-bf9fd071-58af-4e28-ad6c-4ed7eeb281ad` |
| 18 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-89f5b3e6-1b49-4c6a-a7bc-c0e662b36b62` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-7a68f4d6-0a57-492d-818c-7b8a95136d08` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-cf503af8-d20a-43e6-b617-2e13d7ba116e` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-5fc77780-941c-4309-a1a3-c5f6b2f51fa9` |
| 22 | `GET /v1/credits/balance` | 200 | 5 | `qa-9254a184-8a56-47b8-9edb-5d87252e4266` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-9a2c274d-8ace-4d2c-ae14-e9b56103183a` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 5 | `qa-b862cfa0-d5d9-47af-9411-127706d75c2e` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-93e55a8b-ca34-4621-b490-f80d18d1b222` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 9 | `qa-9e081ec4-359f-41b3-b973-bc0a6dc9c0e3` |
| 27 | `GET /v1/credits/balance` | 200 | 7 | `qa-ddeb1426-a7cf-4e05-bc9a-7a7ff7dacb4a` |
| 28 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-4263f924-9a69-4732-85a1-c8cfcf0a35fb` |
| 29 | `POST /v1/auth/token` | 401 | 5 | `qa-0e7f63c2-70c7-4f60-81d1-e7913037ebeb` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-80e21bc8-9fcd-49b1-9443-550ceea66328` |
| 31 | `POST /v1/auth/token` | 401 | 4 | `qa-7e4054ac-b5d1-4515-8fcb-becb7cf3ad32` |
| 32 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d72f9711-c61a-4612-8389-51870c4508bc` |
| 33 | `POST /v1/auth/token` | 401 | 4 | `qa-848d696e-426b-4bbe-9e46-39473c3829b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d135cbf8-93b5-4976-a8c1-5af4b54e1c5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d135cbf8-93b5-4976-a8c1-5af4b54e1c5c
Content-Type: application/json

--- request body ---
{"handle":"qa-8409e6b089c7","displayName":"QA 8409e6b089c7","password":"****","region":"eu"}

--- response: 201 in 492 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d135cbf8-93b5-4976-a8c1-5af4b54e1c5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-8409e6b089c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d34d2ee1-c793-4db9-a1b9-8ad7478d5eea","handle":"qa-8409e6b089c7","displayName":"QA 8409e6b089c7","region":"eu","role":"user","createdAt":"2026-11-22T09:54:48.314552044Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-108f3a32-4c98-4b82-baa1-72b9bd0e3039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-108f3a32-4c98-4b82-baa1-72b9bd0e3039
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba8478d9720","displayName":"QA 5ba8478d9720","password":"****","region":"us"}

--- response: 201 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-108f3a32-4c98-4b82-baa1-72b9bd0e3039
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
Location: /v1/accounts/qa-5ba8478d9720
X-Served-Region: us
Content-Length: 181

{"id":"acc_c5a36dc8-e592-4be3-911d-9cbf4ba8e794","handle":"qa-5ba8478d9720","displayName":"QA 5ba8478d9720","region":"us","role":"user","createdAt":"2026-11-22T09:54:48.878643208Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-459684be-9fc9-43be-9ca4-cdc407cee7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-459684be-9fc9-43be-9ca4-cdc407cee7ab
Content-Type: application/json

--- request body ---
{"handle":"qa-5cf35ad7ecd8","displayName":"QA 5cf35ad7ecd8","password":"****","region":"in"}

--- response: 201 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-459684be-9fc9-43be-9ca4-cdc407cee7ab
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
Location: /v1/accounts/qa-5cf35ad7ecd8
X-Served-Region: in
Content-Length: 181

{"id":"acc_3be7c5c4-d57e-46b3-adae-33484e9e0d69","handle":"qa-5cf35ad7ecd8","displayName":"QA 5cf35ad7ecd8","region":"in","role":"user","createdAt":"2026-11-22T09:54:48.931825317Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b7550e8e-9f70-443f-a5d9-b414afc5ef44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7550e8e-9f70-443f-a5d9-b414afc5ef44
Content-Type: application/json

--- request body ---
{"handle":"qa-8409e6b089c7","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7550e8e-9f70-443f-a5d9-b414afc5ef44
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d34d2ee1-c793-4db9-a1b9-8ad7478d5eea"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d46f9109-3c5a-4e26-8607-b7e3b189f3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d46f9109-3c5a-4e26-8607-b7e3b189f3f1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ba8478d9720","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d46f9109-3c5a-4e26-8607-b7e3b189f3f1
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
Location: /v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326
X-Data-Region: us
Content-Length: 238

{"id":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8409e6b089c7","qa-5ba8478d9720"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:49.059525380Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f1799b7-02f1-40db-9e0f-8f338b9aed03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f1799b7-02f1-40db-9e0f-8f338b9aed03
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba8478d9720","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f1799b7-02f1-40db-9e0f-8f338b9aed03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5a36dc8-e592-4be3-911d-9cbf4ba8e794"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-f7db083e-3885-4cef-a240-1dbfe178acee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7db083e-3885-4cef-a240-1dbfe178acee
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7db083e-3885-4cef-a240-1dbfe178acee
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

{"items":[{"id":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8409e6b089c7","qa-5ba8478d9720"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-22T09:54:49.059525380Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-8cb822da-9909-4365-9b69-ffd41098506e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb822da-9909-4365-9b69-ffd41098506e
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cb822da-9909-4365-9b69-ffd41098506e
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

{"items":[{"id":"msg_3a28c6fe-0b94-4a00-a6e5-e0510d09bd71","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-8409e6b089c7","body":"Hi Ben, got a minute?","createdAt":"2026-11-22T09:54:49.059540950Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/read
correlation: qa-8831f804-11a6-4a9f-bfb8-da65c7dc7dea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8831f804-11a6-4a9f-bfb8-da65c7dc7dea
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8831f804-11a6-4a9f-bfb8-da65c7dc7dea
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

{"conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326
correlation: qa-bf0da57d-fbdb-4071-8622-692b7ca5737e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0da57d-fbdb-4071-8622-692b7ca5737e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf0da57d-fbdb-4071-8622-692b7ca5737e
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

{"id":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8409e6b089c7","qa-5ba8478d9720"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:49.059525380Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-d7c725ec-dc21-434c-99fb-5ef5d7238791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7c725ec-dc21-434c-99fb-5ef5d7238791
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7c725ec-dc21-434c-99fb-5ef5d7238791
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

{"id":"msg_f6123bf0-e063-4d29-b62b-e9c22e128578","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-5ba8478d9720","body":"Sure, now works","createdAt":"2026-11-22T09:54:49.746506328Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-92216c4c-1891-4067-8d17-06b4b3f0f99b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92216c4c-1891-4067-8d17-06b4b3f0f99b
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-92216c4c-1891-4067-8d17-06b4b3f0f99b
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

{"id":"msg_a422160b-d9d0-456e-9132-cf21c5b59961","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-5ba8478d9720","body":"Calling you","createdAt":"2026-11-22T09:54:49.779221046Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326
correlation: qa-3e36a353-1a09-4da8-8472-6decb1ff6e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e36a353-1a09-4da8-8472-6decb1ff6e57
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e36a353-1a09-4da8-8472-6decb1ff6e57
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

{"id":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8409e6b089c7","qa-5ba8478d9720"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-22T09:54:49.059525380Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-ac05dd00-638b-4711-8c46-2737bd268c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac05dd00-638b-4711-8c46-2737bd268c51
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac05dd00-638b-4711-8c46-2737bd268c51
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

{"items":[{"id":"msg_3a28c6fe-0b94-4a00-a6e5-e0510d09bd71","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-8409e6b089c7","body":"Hi Ben, got a minute?","createdAt":"2026-11-22T09:54:49.059540950Z"},{"id":"msg_f6123bf0-e063-4d29-b62b-e9c22e128578","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-5ba8478d9720","body":"Sure, now works","createdAt":"2026-11-22T09:54:49.746506328Z"},{"id":"msg_a422160b-d9d0-456e-9132-cf21c5b59961","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-5ba8478d9720","body":"Calling you","createdAt":"2026-11-22T09:54:49.779221046Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-49de3783-3d5e-4991-b2b0-9d4f5c6ca793

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49de3783-3d5e-4991-b2b0-9d4f5c6ca793
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-49de3783-3d5e-4991-b2b0-9d4f5c6ca793
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

{"balance":4,"currency":"credits","accountId":"acc_d34d2ee1-c793-4db9-a1b9-8ad7478d5eea"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-2333a281-334b-454c-98f5-fff3caeebd0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2333a281-334b-454c-98f5-fff3caeebd0b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2333a281-334b-454c-98f5-fff3caeebd0b
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

{"balance":3,"currency":"credits","accountId":"acc_c5a36dc8-e592-4be3-911d-9cbf4ba8e794"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-bf9fd071-58af-4e28-ad6c-4ed7eeb281ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf9fd071-58af-4e28-ad6c-4ed7eeb281ad
Content-Type: application/json

--- request body ---
{"handle":"qa-5cf35ad7ecd8","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf9fd071-58af-4e28-ad6c-4ed7eeb281ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3be7c5c4-d57e-46b3-adae-33484e9e0d69"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326
correlation: qa-89f5b3e6-1b49-4c6a-a7bc-c0e662b36b62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89f5b3e6-1b49-4c6a-a7bc-c0e662b36b62
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89f5b3e6-1b49-4c6a-a7bc-c0e662b36b62
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","correlationId":"qa-89f5b3e6-1b49-4c6a-a7bc-c0e662b36b62"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-7a68f4d6-0a57-492d-818c-7b8a95136d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a68f4d6-0a57-492d-818c-7b8a95136d08
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a68f4d6-0a57-492d-818c-7b8a95136d08
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages","correlationId":"qa-7a68f4d6-0a57-492d-818c-7b8a95136d08"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-cf503af8-d20a-43e6-b617-2e13d7ba116e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf503af8-d20a-43e6-b617-2e13d7ba116e
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf503af8-d20a-43e6-b617-2e13d7ba116e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages","correlationId":"qa-cf503af8-d20a-43e6-b617-2e13d7ba116e"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-5fc77780-941c-4309-a1a3-c5f6b2f51fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc77780-941c-4309-a1a3-c5f6b2f51fa9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fc77780-941c-4309-a1a3-c5f6b2f51fa9
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
correlation: qa-9254a184-8a56-47b8-9edb-5d87252e4266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9254a184-8a56-47b8-9edb-5d87252e4266
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9254a184-8a56-47b8-9edb-5d87252e4266
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

{"balance":5,"currency":"credits","accountId":"acc_3be7c5c4-d57e-46b3-adae-33484e9e0d69"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/close
correlation: qa-9a2c274d-8ace-4d2c-ae14-e9b56103183a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a2c274d-8ace-4d2c-ae14-e9b56103183a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a2c274d-8ace-4d2c-ae14-e9b56103183a
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

{"id":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-8409e6b089c7","qa-5ba8478d9720"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-22T09:54:49.059525380Z","closedAt":"2026-11-22T09:54:50.264966194Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/close
correlation: qa-b862cfa0-d5d9-47af-9411-127706d75c2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b862cfa0-d5d9-47af-9411-127706d75c2e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b862cfa0-d5d9-47af-9411-127706d75c2e
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

{"id":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-8409e6b089c7","qa-5ba8478d9720"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-22T09:54:49.059525380Z","closedAt":"2026-11-22T09:54:50.264966194Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-93e55a8b-ca34-4621-b490-f80d18d1b222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e55a8b-ca34-4621-b490-f80d18d1b222
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-93e55a8b-ca34-4621-b490-f80d18d1b222
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

{"items":[{"id":"msg_3a28c6fe-0b94-4a00-a6e5-e0510d09bd71","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-8409e6b089c7","body":"Hi Ben, got a minute?","createdAt":"2026-11-22T09:54:49.059540950Z"},{"id":"msg_f6123bf0-e063-4d29-b62b-e9c22e128578","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-5ba8478d9720","body":"Sure, now works","createdAt":"2026-11-22T09:54:49.746506328Z"},{"id":"msg_a422160b-d9d0-456e-9132-cf21c5b59961","conversationId":"cnv_01bc14b9-13b5-42b3-96e7-c05485a93326","sender":"qa-5ba8478d9720","body":"Calling you","createdAt":"2026-11-22T09:54:49.779221046Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages
correlation: qa-9e081ec4-359f-41b3-b973-bc0a6dc9c0e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e081ec4-359f-41b3-b973-bc0a6dc9c0e3
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e081ec4-359f-41b3-b973-bc0a6dc9c0e3
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_01bc14b9-13b5-42b3-96e7-c05485a93326/messages","correlationId":"qa-9e081ec4-359f-41b3-b973-bc0a6dc9c0e3"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-ddeb1426-a7cf-4e05-bc9a-7a7ff7dacb4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddeb1426-a7cf-4e05-bc9a-7a7ff7dacb4a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddeb1426-a7cf-4e05-bc9a-7a7ff7dacb4a
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

{"balance":3,"currency":"credits","accountId":"acc_c5a36dc8-e592-4be3-911d-9cbf4ba8e794"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4263f924-9a69-4732-85a1-c8cfcf0a35fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4263f924-9a69-4732-85a1-c8cfcf0a35fb
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4263f924-9a69-4732-85a1-c8cfcf0a35fb
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
correlation: qa-0e7f63c2-70c7-4f60-81d1-e7913037ebeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e7f63c2-70c7-4f60-81d1-e7913037ebeb
Content-Type: application/json

--- request body ---
{"handle":"qa-5cf35ad7ecd8","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e7f63c2-70c7-4f60-81d1-e7913037ebeb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e7f63c2-70c7-4f60-81d1-e7913037ebeb"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80e21bc8-9fcd-49b1-9443-550ceea66328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e21bc8-9fcd-49b1-9443-550ceea66328
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80e21bc8-9fcd-49b1-9443-550ceea66328
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
correlation: qa-7e4054ac-b5d1-4515-8fcb-becb7cf3ad32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e4054ac-b5d1-4515-8fcb-becb7cf3ad32
Content-Type: application/json

--- request body ---
{"handle":"qa-5ba8478d9720","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e4054ac-b5d1-4515-8fcb-becb7cf3ad32
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e4054ac-b5d1-4515-8fcb-becb7cf3ad32"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d72f9711-c61a-4612-8389-51870c4508bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d72f9711-c61a-4612-8389-51870c4508bc
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d72f9711-c61a-4612-8389-51870c4508bc
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
correlation: qa-848d696e-426b-4bbe-9e46-39473c3829b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848d696e-426b-4bbe-9e46-39473c3829b0
Content-Type: application/json

--- request body ---
{"handle":"qa-8409e6b089c7","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-848d696e-426b-4bbe-9e46-39473c3829b0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-848d696e-426b-4bbe-9e46-39473c3829b0"}
```
