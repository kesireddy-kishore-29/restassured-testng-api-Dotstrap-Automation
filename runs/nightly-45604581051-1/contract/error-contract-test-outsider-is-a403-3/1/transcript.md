# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-3bf4ac77-8106-41af-a1ff-67d5d95605db` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-bdf62cda-e13f-4bcd-9a78-d4f434e0b15d` |
| 3 | `POST /v1/accounts` | 201 | 16 | `qa-6fbb90eb-9ee3-46ea-a24a-b4b5c4b2397e` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-ed5182ac-9ef0-45d6-9aeb-33e47e9f5d9c` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-466c6dfb-22a2-4eb1-9559-bfcd4258faa6` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-2de6fa80-3ff7-414f-b27c-7a0765e62ada` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 17 | `qa-8c98ab49-63be-44d5-ba94-55b8b255210c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-71410b13-5d04-452f-a52e-d083dd388a39` |
| 9 | `POST /v1/auth/token` | 401 | 45 | `qa-1cf85f5e-53fb-4a5c-9b8e-fc5e4bee6701` |
| 10 | `POST /v1/auth/token` | 200 | 33 | `qa-f94d2522-cea2-4328-9b0b-4582c94facf2` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ed5aac2d-27b6-49e9-9bf1-cfd997cc0b37` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-6b269cca-98a4-46db-b776-d9584f47d0cc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-caf3d1c8-43c2-4221-b973-81080a0e12b9` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-0f156065-e64d-4a42-83dd-448e58d0271f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3bf4ac77-8106-41af-a1ff-67d5d95605db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bf4ac77-8106-41af-a1ff-67d5d95605db
Content-Type: application/json

--- request body ---
{"handle":"qa-b43232a8b9a7","displayName":"QA b43232a8b9a7","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bf4ac77-8106-41af-a1ff-67d5d95605db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-b43232a8b9a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_def1a2da-c6f5-4419-b59f-eacf7af8e98a","handle":"qa-b43232a8b9a7","displayName":"QA b43232a8b9a7","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.346150623Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bdf62cda-e13f-4bcd-9a78-d4f434e0b15d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdf62cda-e13f-4bcd-9a78-d4f434e0b15d
Content-Type: application/json

--- request body ---
{"handle":"qa-07dafabde07b","displayName":"QA 07dafabde07b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdf62cda-e13f-4bcd-9a78-d4f434e0b15d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 10
Location: /v1/accounts/qa-07dafabde07b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb43cf13-2066-4f6f-845c-2a1258aa6080","handle":"qa-07dafabde07b","displayName":"QA 07dafabde07b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.381675165Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6fbb90eb-9ee3-46ea-a24a-b4b5c4b2397e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fbb90eb-9ee3-46ea-a24a-b4b5c4b2397e
Content-Type: application/json

--- request body ---
{"handle":"qa-3eb7fddb6f65","displayName":"QA 3eb7fddb6f65","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fbb90eb-9ee3-46ea-a24a-b4b5c4b2397e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Location: /v1/accounts/qa-3eb7fddb6f65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5505978c-2ced-4ebc-85da-e214f7be4460","handle":"qa-3eb7fddb6f65","displayName":"QA 3eb7fddb6f65","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.421243828Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ed5182ac-9ef0-45d6-9aeb-33e47e9f5d9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed5182ac-9ef0-45d6-9aeb-33e47e9f5d9c
Content-Type: application/json

--- request body ---
{"handle":"qa-b43232a8b9a7","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed5182ac-9ef0-45d6-9aeb-33e47e9f5d9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_def1a2da-c6f5-4419-b59f-eacf7af8e98a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-466c6dfb-22a2-4eb1-9559-bfcd4258faa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466c6dfb-22a2-4eb1-9559-bfcd4258faa6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-07dafabde07b","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-466c6dfb-22a2-4eb1-9559-bfcd4258faa6
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
Location: /v1/conversations/cnv_72417fb8-63b3-4564-8a9c-2b745c902bfc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_72417fb8-63b3-4564-8a9c-2b745c902bfc","subject":"Error contract","status":"open","region":"eu","participants":["qa-b43232a8b9a7","qa-07dafabde07b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.479391622Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2de6fa80-3ff7-414f-b27c-7a0765e62ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2de6fa80-3ff7-414f-b27c-7a0765e62ada
Content-Type: application/json

--- request body ---
{"handle":"qa-3eb7fddb6f65","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2de6fa80-3ff7-414f-b27c-7a0765e62ada
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5505978c-2ced-4ebc-85da-e214f7be4460"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_72417fb8-63b3-4564-8a9c-2b745c902bfc/read
correlation: qa-8c98ab49-63be-44d5-ba94-55b8b255210c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c98ab49-63be-44d5-ba94-55b8b255210c
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c98ab49-63be-44d5-ba94-55b8b255210c
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_72417fb8-63b3-4564-8a9c-2b745c902bfc/read","correlationId":"qa-8c98ab49-63be-44d5-ba94-55b8b255210c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71410b13-5d04-452f-a52e-d083dd388a39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71410b13-5d04-452f-a52e-d083dd388a39
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71410b13-5d04-452f-a52e-d083dd388a39
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-1cf85f5e-53fb-4a5c-9b8e-fc5e4bee6701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf85f5e-53fb-4a5c-9b8e-fc5e4bee6701
Content-Type: application/json

--- request body ---
{"handle":"qa-3eb7fddb6f65","password":"****"}

--- response: 401 in 45 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cf85f5e-53fb-4a5c-9b8e-fc5e4bee6701
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1cf85f5e-53fb-4a5c-9b8e-fc5e4bee6701"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f94d2522-cea2-4328-9b0b-4582c94facf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94d2522-cea2-4328-9b0b-4582c94facf2
Content-Type: application/json

--- request body ---
{"handle":"qa-07dafabde07b","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f94d2522-cea2-4328-9b0b-4582c94facf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb43cf13-2066-4f6f-845c-2a1258aa6080"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed5aac2d-27b6-49e9-9bf1-cfd997cc0b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed5aac2d-27b6-49e9-9bf1-cfd997cc0b37
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed5aac2d-27b6-49e9-9bf1-cfd997cc0b37
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
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-6b269cca-98a4-46db-b776-d9584f47d0cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b269cca-98a4-46db-b776-d9584f47d0cc
Content-Type: application/json

--- request body ---
{"handle":"qa-07dafabde07b","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b269cca-98a4-46db-b776-d9584f47d0cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b269cca-98a4-46db-b776-d9584f47d0cc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-caf3d1c8-43c2-4221-b973-81080a0e12b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caf3d1c8-43c2-4221-b973-81080a0e12b9
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-caf3d1c8-43c2-4221-b973-81080a0e12b9
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-0f156065-e64d-4a42-83dd-448e58d0271f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f156065-e64d-4a42-83dd-448e58d0271f
Content-Type: application/json

--- request body ---
{"handle":"qa-b43232a8b9a7","password":"****"}

--- response: 401 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f156065-e64d-4a42-83dd-448e58d0271f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f156065-e64d-4a42-83dd-448e58d0271f"}
```
