# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-02bed28b-243a-47a8-925d-a89a8568157f` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-1c621112-717a-499a-9b12-d6dc050fcdd1` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-0fc88e28-5f23-4ad7-956b-ad80365a74d7` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-46413a73-3e54-4a28-84dc-b432378c0831` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 20 | `qa-e1e6024e-fc9e-4b8d-90da-9bec765b2e52` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-f43cf484-8c81-4a2c-9727-82be3debab73` |
| 7 | `DELETE /v1/accounts/me` | 204 | 61 | `qa-50c1229b-04e8-4343-8dc5-5c4748df0ea5` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-c5c6c76e-c200-44d5-b540-101cd996baf2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6e1fd02c-25de-46be-84e5-3cfb310a9c66` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-cea53797-11ac-4f83-9707-af2adb9d994f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-02bed28b-243a-47a8-925d-a89a8568157f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02bed28b-243a-47a8-925d-a89a8568157f
Content-Type: application/json

--- request body ---
{"handle":"qa-65a4d69a97dd","displayName":"QA 65a4d69a97dd","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-02bed28b-243a-47a8-925d-a89a8568157f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-65a4d69a97dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_67468bc8-4822-41fc-836b-c132f6e6c8e9","handle":"qa-65a4d69a97dd","displayName":"QA 65a4d69a97dd","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.797927876Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1c621112-717a-499a-9b12-d6dc050fcdd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c621112-717a-499a-9b12-d6dc050fcdd1
Content-Type: application/json

--- request body ---
{"handle":"qa-10cf6f01c5e3","displayName":"QA 10cf6f01c5e3","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c621112-717a-499a-9b12-d6dc050fcdd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-10cf6f01c5e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b148efd-56f5-4b65-b914-e1f73c20a676","handle":"qa-10cf6f01c5e3","displayName":"QA 10cf6f01c5e3","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.828129501Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0fc88e28-5f23-4ad7-956b-ad80365a74d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc88e28-5f23-4ad7-956b-ad80365a74d7
Content-Type: application/json

--- request body ---
{"handle":"qa-65a4d69a97dd","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fc88e28-5f23-4ad7-956b-ad80365a74d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67468bc8-4822-41fc-836b-c132f6e6c8e9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-46413a73-3e54-4a28-84dc-b432378c0831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46413a73-3e54-4a28-84dc-b432378c0831
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-10cf6f01c5e3","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-46413a73-3e54-4a28-84dc-b432378c0831
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
Location: /v1/conversations/cnv_ec27eb46-3c2e-4809-baf5-0182e8404c02
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ec27eb46-3c2e-4809-baf5-0182e8404c02","subject":"Error contract","status":"open","region":"eu","participants":["qa-65a4d69a97dd","qa-10cf6f01c5e3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.893399506Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_ec27eb46-3c2e-4809-baf5-0182e8404c02/messages
correlation: qa-e1e6024e-fc9e-4b8d-90da-9bec765b2e52

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 532f161d-5f8c-49ef-b6ea-e3f83430bbc8
X-Correlation-Id: qa-e1e6024e-fc9e-4b8d-90da-9bec765b2e52
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1e6024e-fc9e-4b8d-90da-9bec765b2e52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ec27eb46-3c2e-4809-baf5-0182e8404c02/messages","correlationId":"qa-e1e6024e-fc9e-4b8d-90da-9bec765b2e52"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f43cf484-8c81-4a2c-9727-82be3debab73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f43cf484-8c81-4a2c-9727-82be3debab73
Content-Type: application/json

--- request body ---
{"handle":"qa-10cf6f01c5e3","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f43cf484-8c81-4a2c-9727-82be3debab73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b148efd-56f5-4b65-b914-e1f73c20a676"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50c1229b-04e8-4343-8dc5-5c4748df0ea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c1229b-04e8-4343-8dc5-5c4748df0ea5
Content-Type: application/json

--- response: 204 in 61 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50c1229b-04e8-4343-8dc5-5c4748df0ea5
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c5c6c76e-c200-44d5-b540-101cd996baf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c6c76e-c200-44d5-b540-101cd996baf2
Content-Type: application/json

--- request body ---
{"handle":"qa-10cf6f01c5e3","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5c6c76e-c200-44d5-b540-101cd996baf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5c6c76e-c200-44d5-b540-101cd996baf2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e1fd02c-25de-46be-84e5-3cfb310a9c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e1fd02c-25de-46be-84e5-3cfb310a9c66
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e1fd02c-25de-46be-84e5-3cfb310a9c66
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-cea53797-11ac-4f83-9707-af2adb9d994f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea53797-11ac-4f83-9707-af2adb9d994f
Content-Type: application/json

--- request body ---
{"handle":"qa-65a4d69a97dd","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cea53797-11ac-4f83-9707-af2adb9d994f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cea53797-11ac-4f83-9707-af2adb9d994f"}
```
