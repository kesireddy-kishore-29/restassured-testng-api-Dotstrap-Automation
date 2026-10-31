# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-c6046b45-d661-4f14-bdc0-64102d81773f` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-992990e3-bb46-492c-9793-e017b148f84e` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-a55a8a6d-55e8-42d1-b07d-1e76ee020b97` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-8bf1b3ac-98dc-4404-87e5-24435f7e32ef` |
| 5 | `GET /v1/admin/stats` | 503 | 3 | `qa-e7487941-8887-4382-ae64-1e0daebea878` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-0b791fd5-5e8f-42e7-9b2d-985d3f63cfb2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e1087f03-ea8b-4883-9d14-d741af7b4b35` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-56312b37-bec0-4a79-8d01-0ff54d4f5e26` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-78088b60-5921-4db4-8062-9cff79056ed2` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-debe3b5e-755b-4b92-92f6-8a56dfca91d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6046b45-d661-4f14-bdc0-64102d81773f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6046b45-d661-4f14-bdc0-64102d81773f
Content-Type: application/json

--- request body ---
{"handle":"qa-e8bee8088807","displayName":"QA e8bee8088807","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6046b45-d661-4f14-bdc0-64102d81773f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Location: /v1/accounts/qa-e8bee8088807
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50862cc9-a501-4136-bcea-51c145ef33c3","handle":"qa-e8bee8088807","displayName":"QA e8bee8088807","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.667996859Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-992990e3-bb46-492c-9793-e017b148f84e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-992990e3-bb46-492c-9793-e017b148f84e
Content-Type: application/json

--- request body ---
{"handle":"qa-d855df310775","displayName":"QA d855df310775","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-992990e3-bb46-492c-9793-e017b148f84e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Location: /v1/accounts/qa-d855df310775
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1075093a-a890-4e2c-a8b7-ce8fcb8e6a2e","handle":"qa-d855df310775","displayName":"QA d855df310775","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.709029400Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a55a8a6d-55e8-42d1-b07d-1e76ee020b97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55a8a6d-55e8-42d1-b07d-1e76ee020b97
Content-Type: application/json

--- request body ---
{"handle":"qa-e8bee8088807","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a55a8a6d-55e8-42d1-b07d-1e76ee020b97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50862cc9-a501-4136-bcea-51c145ef33c3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8bf1b3ac-98dc-4404-87e5-24435f7e32ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf1b3ac-98dc-4404-87e5-24435f7e32ef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d855df310775","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bf1b3ac-98dc-4404-87e5-24435f7e32ef
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
Location: /v1/conversations/cnv_139f3893-5224-414a-b27b-06d41d9389c2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_139f3893-5224-414a-b27b-06d41d9389c2","subject":"Error contract","status":"open","region":"eu","participants":["qa-e8bee8088807","qa-d855df310775"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.732242244Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-e7487941-8887-4382-ae64-1e0daebea878

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 555ee2a5-639f-4404-ac9a-a1fba776bd72
X-Correlation-Id: qa-e7487941-8887-4382-ae64-1e0daebea878
Content-Type: application/json

--- response: 503 in 3 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7487941-8887-4382-ae64-1e0daebea878
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-e7487941-8887-4382-ae64-1e0daebea878"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0b791fd5-5e8f-42e7-9b2d-985d3f63cfb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b791fd5-5e8f-42e7-9b2d-985d3f63cfb2
Content-Type: application/json

--- request body ---
{"handle":"qa-d855df310775","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b791fd5-5e8f-42e7-9b2d-985d3f63cfb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1075093a-a890-4e2c-a8b7-ce8fcb8e6a2e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1087f03-ea8b-4883-9d14-d741af7b4b35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1087f03-ea8b-4883-9d14-d741af7b4b35
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1087f03-ea8b-4883-9d14-d741af7b4b35
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
correlation: qa-56312b37-bec0-4a79-8d01-0ff54d4f5e26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56312b37-bec0-4a79-8d01-0ff54d4f5e26
Content-Type: application/json

--- request body ---
{"handle":"qa-d855df310775","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56312b37-bec0-4a79-8d01-0ff54d4f5e26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56312b37-bec0-4a79-8d01-0ff54d4f5e26"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78088b60-5921-4db4-8062-9cff79056ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78088b60-5921-4db4-8062-9cff79056ed2
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78088b60-5921-4db4-8062-9cff79056ed2
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
correlation: qa-debe3b5e-755b-4b92-92f6-8a56dfca91d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-debe3b5e-755b-4b92-92f6-8a56dfca91d9
Content-Type: application/json

--- request body ---
{"handle":"qa-e8bee8088807","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-debe3b5e-755b-4b92-92f6-8a56dfca91d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-debe3b5e-755b-4b92-92f6-8a56dfca91d9"}
```
