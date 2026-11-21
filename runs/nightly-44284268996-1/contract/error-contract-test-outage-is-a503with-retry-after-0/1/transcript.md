# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-95cad58a-70a5-411b-9560-970952eba9d4` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-0f0e5544-57be-4de5-9ddf-c23dedd04561` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-b8988139-272b-42ea-b240-2021a598c0b8` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-76c5a370-48cb-425e-b4ed-264a66c78b32` |
| 5 | `POST /v1/auth/token` | 503 | 18 | `qa-c92dbe10-b54f-473e-b4ff-e9c56cda94bf` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-54d21da6-95b0-4b06-80a8-335def535b32` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c52b4d7f-9100-4e42-9d15-71c1fb2e817b` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-ec9440a5-8d40-44d2-ac1b-3fc6ab267b9a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-b6c7073c-a84c-47c4-98c9-52ae28923a94` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-60605db1-0331-4430-b954-f6d9b2f3d41b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95cad58a-70a5-411b-9560-970952eba9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95cad58a-70a5-411b-9560-970952eba9d4
Content-Type: application/json

--- request body ---
{"handle":"qa-adff2ff2e508","displayName":"QA adff2ff2e508","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-95cad58a-70a5-411b-9560-970952eba9d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-adff2ff2e508
X-Served-Region: eu
Content-Length: 181

{"id":"acc_035a670c-bf6d-4c87-8132-661690b0c38b","handle":"qa-adff2ff2e508","displayName":"QA adff2ff2e508","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.540594278Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f0e5544-57be-4de5-9ddf-c23dedd04561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0e5544-57be-4de5-9ddf-c23dedd04561
Content-Type: application/json

--- request body ---
{"handle":"qa-4576492ab5ca","displayName":"QA 4576492ab5ca","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f0e5544-57be-4de5-9ddf-c23dedd04561
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
Location: /v1/accounts/qa-4576492ab5ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48cb02b4-d78f-490c-9b48-f9aecbd0dcaa","handle":"qa-4576492ab5ca","displayName":"QA 4576492ab5ca","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.578297331Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b8988139-272b-42ea-b240-2021a598c0b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8988139-272b-42ea-b240-2021a598c0b8
Content-Type: application/json

--- request body ---
{"handle":"qa-adff2ff2e508","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8988139-272b-42ea-b240-2021a598c0b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_035a670c-bf6d-4c87-8132-661690b0c38b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-76c5a370-48cb-425e-b4ed-264a66c78b32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76c5a370-48cb-425e-b4ed-264a66c78b32
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4576492ab5ca","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-76c5a370-48cb-425e-b4ed-264a66c78b32
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
Location: /v1/conversations/cnv_0005979b-a164-4ac6-8f33-898dde0278cb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0005979b-a164-4ac6-8f33-898dde0278cb","subject":"Error contract","status":"open","region":"eu","participants":["qa-adff2ff2e508","qa-4576492ab5ca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.666276974Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c92dbe10-b54f-473e-b4ff-e9c56cda94bf

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 22279ee6-c56c-4f1b-97f1-6e47dc5fddac
X-Correlation-Id: qa-c92dbe10-b54f-473e-b4ff-e9c56cda94bf
Content-Type: application/json

--- request body ---
{"handle":"qa-adff2ff2e508","password":"****"}

--- response: 503 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c92dbe10-b54f-473e-b4ff-e9c56cda94bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-c92dbe10-b54f-473e-b4ff-e9c56cda94bf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-54d21da6-95b0-4b06-80a8-335def535b32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d21da6-95b0-4b06-80a8-335def535b32
Content-Type: application/json

--- request body ---
{"handle":"qa-4576492ab5ca","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-54d21da6-95b0-4b06-80a8-335def535b32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48cb02b4-d78f-490c-9b48-f9aecbd0dcaa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c52b4d7f-9100-4e42-9d15-71c1fb2e817b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c52b4d7f-9100-4e42-9d15-71c1fb2e817b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c52b4d7f-9100-4e42-9d15-71c1fb2e817b
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
correlation: qa-ec9440a5-8d40-44d2-ac1b-3fc6ab267b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec9440a5-8d40-44d2-ac1b-3fc6ab267b9a
Content-Type: application/json

--- request body ---
{"handle":"qa-4576492ab5ca","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec9440a5-8d40-44d2-ac1b-3fc6ab267b9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec9440a5-8d40-44d2-ac1b-3fc6ab267b9a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6c7073c-a84c-47c4-98c9-52ae28923a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6c7073c-a84c-47c4-98c9-52ae28923a94
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6c7073c-a84c-47c4-98c9-52ae28923a94
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
correlation: qa-60605db1-0331-4430-b954-f6d9b2f3d41b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60605db1-0331-4430-b954-f6d9b2f3d41b
Content-Type: application/json

--- request body ---
{"handle":"qa-adff2ff2e508","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60605db1-0331-4430-b954-f6d9b2f3d41b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60605db1-0331-4430-b954-f6d9b2f3d41b"}
```
