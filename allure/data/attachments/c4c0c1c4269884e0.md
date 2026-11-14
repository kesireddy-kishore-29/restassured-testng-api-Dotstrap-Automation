# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-49759fe6-80e7-4f3d-ad32-ad672b4d678a` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-fed99e15-457d-4b9c-a270-ba269bb1bd78` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-af8ee668-be7f-4580-a6d2-038bdfd81e32` |
| 4 | `POST /v1/conversations` | 201 | 60 | `qa-487704e0-ec2c-421b-b9f2-0a78a39cc7a9` |
| 5 | `GET /v1/conversations` | 200 | 32 | `qa-8ad6a44e-b294-4ed0-8cd5-6e6a11d9c885` |
| 6 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-782cdebd-3a0f-47f4-aed7-83a0d009ebbd` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-6e33841a-6123-486a-8737-1960194db09b` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-6304f72b-1820-437c-8365-1b7baf0676b7` |
| 9 | `POST /v1/auth/token` | 200 | 18 | `qa-34e03064-0c9c-4b35-be9a-eb9dc6b783dc` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-2f0e17d2-3669-4646-b63e-af98c1ac5426` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5463bd34-7ad2-4bb9-bd5d-d7bc33129375` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-cf388031-f3d9-4b4b-b540-863e6f048ce4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-70c79a52-aa4e-485a-b3b4-36106d3ff7c4` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-e6b7e3ff-2434-448f-a777-3f6616ca324d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49759fe6-80e7-4f3d-ad32-ad672b4d678a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49759fe6-80e7-4f3d-ad32-ad672b4d678a
Content-Type: application/json

--- request body ---
{"handle":"qa-2362c854980d","displayName":"QA 2362c854980d","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-49759fe6-80e7-4f3d-ad32-ad672b4d678a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-2362c854980d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46737673-6e9a-45e5-831e-0bd3621f7d2f","handle":"qa-2362c854980d","displayName":"QA 2362c854980d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.040353353Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fed99e15-457d-4b9c-a270-ba269bb1bd78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed99e15-457d-4b9c-a270-ba269bb1bd78
Content-Type: application/json

--- request body ---
{"handle":"qa-50e8ae80ebc6","displayName":"QA 50e8ae80ebc6","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-fed99e15-457d-4b9c-a270-ba269bb1bd78
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
Location: /v1/accounts/qa-50e8ae80ebc6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_971e5e27-7f06-4e8d-8764-a73d21e23b91","handle":"qa-50e8ae80ebc6","displayName":"QA 50e8ae80ebc6","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.457499347Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-af8ee668-be7f-4580-a6d2-038bdfd81e32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af8ee668-be7f-4580-a6d2-038bdfd81e32
Content-Type: application/json

--- request body ---
{"handle":"qa-2362c854980d","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-af8ee668-be7f-4580-a6d2-038bdfd81e32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46737673-6e9a-45e5-831e-0bd3621f7d2f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-487704e0-ec2c-421b-b9f2-0a78a39cc7a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-487704e0-ec2c-421b-b9f2-0a78a39cc7a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50e8ae80ebc6","subject":"Contract check","message":"Hello"}

--- response: 201 in 60 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-487704e0-ec2c-421b-b9f2-0a78a39cc7a9
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
Location: /v1/conversations/cnv_08e58100-7f81-4643-a809-588a418f3ac6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","subject":"Contract check","status":"open","region":"eu","participants":["qa-2362c854980d","qa-50e8ae80ebc6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:09.555136357Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-8ad6a44e-b294-4ed0-8cd5-6e6a11d9c885

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad6a44e-b294-4ed0-8cd5-6e6a11d9c885
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad6a44e-b294-4ed0-8cd5-6e6a11d9c885
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
Content-Length: 259

{"items":[{"id":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","subject":"Contract check","status":"open","region":"eu","participants":["qa-2362c854980d","qa-50e8ae80ebc6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:09.555136357Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_08e58100-7f81-4643-a809-588a418f3ac6
correlation: qa-782cdebd-3a0f-47f4-aed7-83a0d009ebbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782cdebd-3a0f-47f4-aed7-83a0d009ebbd
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-782cdebd-3a0f-47f4-aed7-83a0d009ebbd
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","subject":"Contract check","status":"open","region":"eu","participants":["qa-2362c854980d","qa-50e8ae80ebc6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:09.555136357Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_08e58100-7f81-4643-a809-588a418f3ac6/messages
correlation: qa-6e33841a-6123-486a-8737-1960194db09b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e33841a-6123-486a-8737-1960194db09b
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e33841a-6123-486a-8737-1960194db09b
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
Content-Length: 197

{"id":"msg_390e567a-2030-48e1-8804-752b674502b2","conversationId":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","sender":"qa-2362c854980d","body":"Second","createdAt":"2026-11-14T09:05:09.691756230Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_08e58100-7f81-4643-a809-588a418f3ac6/messages
correlation: qa-6304f72b-1820-437c-8365-1b7baf0676b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6304f72b-1820-437c-8365-1b7baf0676b7
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6304f72b-1820-437c-8365-1b7baf0676b7
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
Content-Length: 416

{"items":[{"id":"msg_7656b5a1-4ed9-4cb1-9a86-9a239b19cf1b","conversationId":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","sender":"qa-2362c854980d","body":"Hello","createdAt":"2026-11-14T09:05:09.555370939Z"},{"id":"msg_390e567a-2030-48e1-8804-752b674502b2","conversationId":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","sender":"qa-2362c854980d","body":"Second","createdAt":"2026-11-14T09:05:09.691756230Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-34e03064-0c9c-4b35-be9a-eb9dc6b783dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34e03064-0c9c-4b35-be9a-eb9dc6b783dc
Content-Type: application/json

--- request body ---
{"handle":"qa-50e8ae80ebc6","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-34e03064-0c9c-4b35-be9a-eb9dc6b783dc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_971e5e27-7f06-4e8d-8764-a73d21e23b91"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_08e58100-7f81-4643-a809-588a418f3ac6/read
correlation: qa-2f0e17d2-3669-4646-b63e-af98c1ac5426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f0e17d2-3669-4646-b63e-af98c1ac5426
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f0e17d2-3669-4646-b63e-af98c1ac5426
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
Content-Length: 77

{"conversationId":"cnv_08e58100-7f81-4643-a809-588a418f3ac6","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5463bd34-7ad2-4bb9-bd5d-d7bc33129375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5463bd34-7ad2-4bb9-bd5d-d7bc33129375
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5463bd34-7ad2-4bb9-bd5d-d7bc33129375
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-cf388031-f3d9-4b4b-b540-863e6f048ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf388031-f3d9-4b4b-b540-863e6f048ce4
Content-Type: application/json

--- request body ---
{"handle":"qa-50e8ae80ebc6","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf388031-f3d9-4b4b-b540-863e6f048ce4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf388031-f3d9-4b4b-b540-863e6f048ce4"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70c79a52-aa4e-485a-b3b4-36106d3ff7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70c79a52-aa4e-485a-b3b4-36106d3ff7c4
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70c79a52-aa4e-485a-b3b4-36106d3ff7c4
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e6b7e3ff-2434-448f-a777-3f6616ca324d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6b7e3ff-2434-448f-a777-3f6616ca324d
Content-Type: application/json

--- request body ---
{"handle":"qa-2362c854980d","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6b7e3ff-2434-448f-a777-3f6616ca324d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e6b7e3ff-2434-448f-a777-3f6616ca324d"}
```
