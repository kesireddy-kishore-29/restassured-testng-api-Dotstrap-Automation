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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-94e27bd8-9c1a-420f-bd78-cf6a07735282` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-bec1a19d-fca7-48f8-9815-571eabd67e03` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-0fe36f06-ca0e-424b-8ca3-6df018d9385b` |
| 4 | `POST /v1/auth/token` | 200 | 8 | `qa-775f2c0a-650f-43a0-be88-066904fd5be7` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-00dae236-e909-4e7b-b760-5750c8d65e1a` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-c0dfce2f-6c5c-4fc7-b5cd-4896412540c6` |
| 7 | `GET /v1/conversations` | 200 | 7 | `qa-ebe939bb-3d90-47f5-b05c-0c70fd9c352b` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-f31f18c8-f365-412d-b69c-0a143f637ddc` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 6 | `qa-e46cf69b-50d3-47bc-a887-d5d05afbe3dc` |
| 10 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-baae5720-a545-4e6e-9084-ca3813e9af28` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-412f76ad-5f13-4fe4-88bb-1aaf73025a7e` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-e6ba5063-1bb2-4765-8f5c-c95c414b3d75` |
| 13 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-46367ad1-f3fc-4831-b998-eee82cd87bba` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-cdd82c81-0ec8-429e-ad8a-b4be3257d8c7` |
| 15 | `GET /v1/credits/balance` | 200 | 5 | `qa-35036af9-4422-4d97-877b-481e97d370da` |
| 16 | `GET /v1/credits/balance` | 200 | 5 | `qa-a874074b-b209-4583-9e17-e73ea073d229` |
| 17 | `POST /v1/auth/token` | 200 | 7 | `qa-80e17c54-f288-4a72-9938-731ec23abaa4` |
| 18 | `GET /v1/conversations/{id}` | 403 | 3 | `qa-8377544f-1738-4260-b591-c426bfe237cd` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-9930b5f0-fb6a-4ced-90c5-f8c20eaf489b` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-8be0b83c-7356-4dd5-9ba6-4dda0b892385` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-3841078f-52ad-4d7a-bb8f-33ee6e278755` |
| 22 | `GET /v1/credits/balance` | 200 | 4 | `qa-353fb4b1-edd3-4b4d-beef-13ec74d32e04` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 4 | `qa-8a6a2383-0a79-48d6-913d-07980dd1bd8c` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 4 | `qa-a474fa16-7b85-4074-9dc9-4f548bd7ad2e` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-b3f81daa-30ab-420d-a1b5-18e16f50f897` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 4 | `qa-dd1b4f1e-01d2-4478-a84a-2e1b91c555e6` |
| 27 | `GET /v1/credits/balance` | 200 | 4 | `qa-75bc48e3-084a-4dcc-a79d-189aa51ac3d5` |
| 28 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0c56ea05-55ff-47e1-8fe0-e4afcf5b9e00` |
| 29 | `POST /v1/auth/token` | 401 | 4 | `qa-12c21382-114a-4d83-bea9-84853fe4d652` |
| 30 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5b27b3d0-3636-447a-a050-7b84cb0f01f0` |
| 31 | `POST /v1/auth/token` | 401 | 3 | `qa-e3181b98-b46c-4939-b580-cd82621ef0cd` |
| 32 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-1af1fcd4-f4f9-4f04-8778-e393f2146f76` |
| 33 | `POST /v1/auth/token` | 401 | 5 | `qa-50127707-76d3-4e3c-b3bd-f366714274c2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94e27bd8-9c1a-420f-bd78-cf6a07735282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94e27bd8-9c1a-420f-bd78-cf6a07735282
Content-Type: application/json

--- request body ---
{"handle":"qa-6bfadd5bae53","displayName":"QA 6bfadd5bae53","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-94e27bd8-9c1a-420f-bd78-cf6a07735282
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-6bfadd5bae53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e44b1b3-61dc-499c-9049-f245beba4179","handle":"qa-6bfadd5bae53","displayName":"QA 6bfadd5bae53","region":"eu","role":"user","createdAt":"2026-11-02T09:38:49.497494400Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bec1a19d-fca7-48f8-9815-571eabd67e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec1a19d-fca7-48f8-9815-571eabd67e03
Content-Type: application/json

--- request body ---
{"handle":"qa-2af39f68f460","displayName":"QA 2af39f68f460","password":"****","region":"us"}

--- response: 201 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bec1a19d-fca7-48f8-9815-571eabd67e03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-2af39f68f460
X-Served-Region: us
Content-Length: 181

{"id":"acc_6bc6305c-edbe-48e9-b166-cc71aa63579b","handle":"qa-2af39f68f460","displayName":"QA 2af39f68f460","region":"us","role":"user","createdAt":"2026-11-02T09:38:49.524315566Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0fe36f06-ca0e-424b-8ca3-6df018d9385b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe36f06-ca0e-424b-8ca3-6df018d9385b
Content-Type: application/json

--- request body ---
{"handle":"qa-08320b18950d","displayName":"QA 08320b18950d","password":"****","region":"in"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fe36f06-ca0e-424b-8ca3-6df018d9385b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-08320b18950d
X-Served-Region: in
Content-Length: 181

{"id":"acc_6c3e91f0-0f05-4d03-a894-54bc1b1d5638","handle":"qa-08320b18950d","displayName":"QA 08320b18950d","region":"in","role":"user","createdAt":"2026-11-02T09:38:49.542665173Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-775f2c0a-650f-43a0-be88-066904fd5be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-775f2c0a-650f-43a0-be88-066904fd5be7
Content-Type: application/json

--- request body ---
{"handle":"qa-6bfadd5bae53","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-775f2c0a-650f-43a0-be88-066904fd5be7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e44b1b3-61dc-499c-9049-f245beba4179"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-00dae236-e909-4e7b-b760-5750c8d65e1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00dae236-e909-4e7b-b760-5750c8d65e1a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2af39f68f460","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-00dae236-e909-4e7b-b760-5750c8d65e1a
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
Location: /v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c
X-Data-Region: us
Content-Length: 238

{"id":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-6bfadd5bae53","qa-2af39f68f460"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:49.574040969Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c0dfce2f-6c5c-4fc7-b5cd-4896412540c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0dfce2f-6c5c-4fc7-b5cd-4896412540c6
Content-Type: application/json

--- request body ---
{"handle":"qa-2af39f68f460","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0dfce2f-6c5c-4fc7-b5cd-4896412540c6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bc6305c-edbe-48e9-b166-cc71aa63579b"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-ebe939bb-3d90-47f5-b05c-0c70fd9c352b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe939bb-3d90-47f5-b05c-0c70fd9c352b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe939bb-3d90-47f5-b05c-0c70fd9c352b
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

{"items":[{"id":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-6bfadd5bae53","qa-2af39f68f460"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-02T09:38:49.574040969Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-f31f18c8-f365-412d-b69c-0a143f637ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f31f18c8-f365-412d-b69c-0a143f637ddc
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f31f18c8-f365-412d-b69c-0a143f637ddc
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

{"items":[{"id":"msg_83660b5d-1250-4084-85a1-672ccae8e7c2","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-6bfadd5bae53","body":"Hi Ben, got a minute?","createdAt":"2026-11-02T09:38:49.574061160Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/read
correlation: qa-e46cf69b-50d3-47bc-a887-d5d05afbe3dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e46cf69b-50d3-47bc-a887-d5d05afbe3dc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e46cf69b-50d3-47bc-a887-d5d05afbe3dc
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

{"conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c
correlation: qa-baae5720-a545-4e6e-9084-ca3813e9af28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baae5720-a545-4e6e-9084-ca3813e9af28
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-baae5720-a545-4e6e-9084-ca3813e9af28
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

{"id":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-6bfadd5bae53","qa-2af39f68f460"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:49.574040969Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-412f76ad-5f13-4fe4-88bb-1aaf73025a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412f76ad-5f13-4fe4-88bb-1aaf73025a7e
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-412f76ad-5f13-4fe4-88bb-1aaf73025a7e
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

{"id":"msg_c803b60b-201e-4f9e-9c29-5a4f26aae5a5","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-2af39f68f460","body":"Sure, now works","createdAt":"2026-11-02T09:38:49.679682843Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-e6ba5063-1bb2-4765-8f5c-c95c414b3d75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6ba5063-1bb2-4765-8f5c-c95c414b3d75
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6ba5063-1bb2-4765-8f5c-c95c414b3d75
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

{"id":"msg_8ec3eb4e-e54b-44e4-be60-fd6e4e659061","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-2af39f68f460","body":"Calling you","createdAt":"2026-11-02T09:38:49.695632150Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c
correlation: qa-46367ad1-f3fc-4831-b998-eee82cd87bba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46367ad1-f3fc-4831-b998-eee82cd87bba
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-46367ad1-f3fc-4831-b998-eee82cd87bba
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

{"id":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","subject":"Project kickoff","status":"open","region":"us","participants":["qa-6bfadd5bae53","qa-2af39f68f460"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-02T09:38:49.574040969Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-cdd82c81-0ec8-429e-ad8a-b4be3257d8c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdd82c81-0ec8-429e-ad8a-b4be3257d8c7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdd82c81-0ec8-429e-ad8a-b4be3257d8c7
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

{"items":[{"id":"msg_83660b5d-1250-4084-85a1-672ccae8e7c2","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-6bfadd5bae53","body":"Hi Ben, got a minute?","createdAt":"2026-11-02T09:38:49.574061160Z"},{"id":"msg_c803b60b-201e-4f9e-9c29-5a4f26aae5a5","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-2af39f68f460","body":"Sure, now works","createdAt":"2026-11-02T09:38:49.679682843Z"},{"id":"msg_8ec3eb4e-e54b-44e4-be60-fd6e4e659061","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-2af39f68f460","body":"Calling you","createdAt":"2026-11-02T09:38:49.695632150Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-35036af9-4422-4d97-877b-481e97d370da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35036af9-4422-4d97-877b-481e97d370da
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-35036af9-4422-4d97-877b-481e97d370da
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

{"balance":4,"currency":"credits","accountId":"acc_4e44b1b3-61dc-499c-9049-f245beba4179"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-a874074b-b209-4583-9e17-e73ea073d229

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a874074b-b209-4583-9e17-e73ea073d229
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-a874074b-b209-4583-9e17-e73ea073d229
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

{"balance":3,"currency":"credits","accountId":"acc_6bc6305c-edbe-48e9-b166-cc71aa63579b"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-80e17c54-f288-4a72-9938-731ec23abaa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e17c54-f288-4a72-9938-731ec23abaa4
Content-Type: application/json

--- request body ---
{"handle":"qa-08320b18950d","password":"****"}

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-80e17c54-f288-4a72-9938-731ec23abaa4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c3e91f0-0f05-4d03-a894-54bc1b1d5638"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c
correlation: qa-8377544f-1738-4260-b591-c426bfe237cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8377544f-1738-4260-b591-c426bfe237cd
Content-Type: application/json

--- response: 403 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8377544f-1738-4260-b591-c426bfe237cd
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","correlationId":"qa-8377544f-1738-4260-b591-c426bfe237cd"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-9930b5f0-fb6a-4ced-90c5-f8c20eaf489b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9930b5f0-fb6a-4ced-90c5-f8c20eaf489b
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9930b5f0-fb6a-4ced-90c5-f8c20eaf489b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages","correlationId":"qa-9930b5f0-fb6a-4ced-90c5-f8c20eaf489b"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-8be0b83c-7356-4dd5-9ba6-4dda0b892385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8be0b83c-7356-4dd5-9ba6-4dda0b892385
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8be0b83c-7356-4dd5-9ba6-4dda0b892385
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages","correlationId":"qa-8be0b83c-7356-4dd5-9ba6-4dda0b892385"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-3841078f-52ad-4d7a-bb8f-33ee6e278755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3841078f-52ad-4d7a-bb8f-33ee6e278755
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-3841078f-52ad-4d7a-bb8f-33ee6e278755
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
correlation: qa-353fb4b1-edd3-4b4d-beef-13ec74d32e04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-353fb4b1-edd3-4b4d-beef-13ec74d32e04
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-353fb4b1-edd3-4b4d-beef-13ec74d32e04
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

{"balance":5,"currency":"credits","accountId":"acc_6c3e91f0-0f05-4d03-a894-54bc1b1d5638"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/close
correlation: qa-8a6a2383-0a79-48d6-913d-07980dd1bd8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a6a2383-0a79-48d6-913d-07980dd1bd8c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a6a2383-0a79-48d6-913d-07980dd1bd8c
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

{"id":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-6bfadd5bae53","qa-2af39f68f460"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-02T09:38:49.574040969Z","closedAt":"2026-11-02T09:38:50.283413791Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/close
correlation: qa-a474fa16-7b85-4074-9dc9-4f548bd7ad2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a474fa16-7b85-4074-9dc9-4f548bd7ad2e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a474fa16-7b85-4074-9dc9-4f548bd7ad2e
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

{"id":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-6bfadd5bae53","qa-2af39f68f460"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-02T09:38:49.574040969Z","closedAt":"2026-11-02T09:38:50.283413791Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-b3f81daa-30ab-420d-a1b5-18e16f50f897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3f81daa-30ab-420d-a1b5-18e16f50f897
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3f81daa-30ab-420d-a1b5-18e16f50f897
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

{"items":[{"id":"msg_83660b5d-1250-4084-85a1-672ccae8e7c2","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-6bfadd5bae53","body":"Hi Ben, got a minute?","createdAt":"2026-11-02T09:38:49.574061160Z"},{"id":"msg_c803b60b-201e-4f9e-9c29-5a4f26aae5a5","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-2af39f68f460","body":"Sure, now works","createdAt":"2026-11-02T09:38:49.679682843Z"},{"id":"msg_8ec3eb4e-e54b-44e4-be60-fd6e4e659061","conversationId":"cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c","sender":"qa-2af39f68f460","body":"Calling you","createdAt":"2026-11-02T09:38:49.695632150Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages
correlation: qa-dd1b4f1e-01d2-4478-a84a-2e1b91c555e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd1b4f1e-01d2-4478-a84a-2e1b91c555e6
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd1b4f1e-01d2-4478-a84a-2e1b91c555e6
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_40cd5fc6-43d6-4662-b383-3b7b073af71c/messages","correlationId":"qa-dd1b4f1e-01d2-4478-a84a-2e1b91c555e6"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-75bc48e3-084a-4dcc-a79d-189aa51ac3d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75bc48e3-084a-4dcc-a79d-189aa51ac3d5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-75bc48e3-084a-4dcc-a79d-189aa51ac3d5
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

{"balance":3,"currency":"credits","accountId":"acc_6bc6305c-edbe-48e9-b166-cc71aa63579b"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c56ea05-55ff-47e1-8fe0-e4afcf5b9e00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c56ea05-55ff-47e1-8fe0-e4afcf5b9e00
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c56ea05-55ff-47e1-8fe0-e4afcf5b9e00
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
correlation: qa-12c21382-114a-4d83-bea9-84853fe4d652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c21382-114a-4d83-bea9-84853fe4d652
Content-Type: application/json

--- request body ---
{"handle":"qa-08320b18950d","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12c21382-114a-4d83-bea9-84853fe4d652
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12c21382-114a-4d83-bea9-84853fe4d652"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b27b3d0-3636-447a-a050-7b84cb0f01f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b27b3d0-3636-447a-a050-7b84cb0f01f0
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b27b3d0-3636-447a-a050-7b84cb0f01f0
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
correlation: qa-e3181b98-b46c-4939-b580-cd82621ef0cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3181b98-b46c-4939-b580-cd82621ef0cd
Content-Type: application/json

--- request body ---
{"handle":"qa-2af39f68f460","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3181b98-b46c-4939-b580-cd82621ef0cd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3181b98-b46c-4939-b580-cd82621ef0cd"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1af1fcd4-f4f9-4f04-8778-e393f2146f76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1af1fcd4-f4f9-4f04-8778-e393f2146f76
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1af1fcd4-f4f9-4f04-8778-e393f2146f76
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
correlation: qa-50127707-76d3-4e3c-b3bd-f366714274c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50127707-76d3-4e3c-b3bd-f366714274c2
Content-Type: application/json

--- request body ---
{"handle":"qa-6bfadd5bae53","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50127707-76d3-4e3c-b3bd-f366714274c2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50127707-76d3-4e3c-b3bd-f366714274c2"}
```
