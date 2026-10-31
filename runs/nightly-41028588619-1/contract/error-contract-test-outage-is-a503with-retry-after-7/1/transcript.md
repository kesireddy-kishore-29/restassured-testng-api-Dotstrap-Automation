# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-09a5ca9d-09f3-43c5-9926-d502caffe957` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-19f5d850-8d32-40b1-ad66-86b95721954a` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-8ce9863e-6205-4775-82cf-d355454588f4` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-234c816c-5352-4669-b739-64c88692ce02` |
| 5 | `GET /v1/conversations` | 503 | 33 | `qa-63abfe93-0129-4a0b-8b5f-cdcb209f4aa4` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-1cf3aa1d-d86b-40c3-9354-2941e18bbafa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-f3365acf-bb38-4562-ab4d-589b758a0f49` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-c4e61977-6fa7-438f-a7fd-0605dce55a2a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d7fd54de-f567-4e5a-b82f-082146e59b82` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-8151d7c9-d74a-4693-ae25-2c63f5740d65` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-09a5ca9d-09f3-43c5-9926-d502caffe957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a5ca9d-09f3-43c5-9926-d502caffe957
Content-Type: application/json

--- request body ---
{"handle":"qa-31a6efc0af90","displayName":"QA 31a6efc0af90","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-09a5ca9d-09f3-43c5-9926-d502caffe957
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Location: /v1/accounts/qa-31a6efc0af90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aead5a38-275d-45c1-987b-af5c534cc5e6","handle":"qa-31a6efc0af90","displayName":"QA 31a6efc0af90","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.864284379Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19f5d850-8d32-40b1-ad66-86b95721954a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f5d850-8d32-40b1-ad66-86b95721954a
Content-Type: application/json

--- request body ---
{"handle":"qa-cd2e28bb425e","displayName":"QA cd2e28bb425e","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f5d850-8d32-40b1-ad66-86b95721954a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Location: /v1/accounts/qa-cd2e28bb425e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd5bda0b-c29a-4ec4-bd71-63e39fe1729c","handle":"qa-cd2e28bb425e","displayName":"QA cd2e28bb425e","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.929948915Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8ce9863e-6205-4775-82cf-d355454588f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ce9863e-6205-4775-82cf-d355454588f4
Content-Type: application/json

--- request body ---
{"handle":"qa-31a6efc0af90","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ce9863e-6205-4775-82cf-d355454588f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aead5a38-275d-45c1-987b-af5c534cc5e6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-234c816c-5352-4669-b739-64c88692ce02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-234c816c-5352-4669-b739-64c88692ce02
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cd2e28bb425e","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-234c816c-5352-4669-b739-64c88692ce02
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
Location: /v1/conversations/cnv_684eba3d-6c98-46bc-a0e5-088c08975e25
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_684eba3d-6c98-46bc-a0e5-088c08975e25","subject":"Error contract","status":"open","region":"eu","participants":["qa-31a6efc0af90","qa-cd2e28bb425e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.064531220Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-63abfe93-0129-4a0b-8b5f-cdcb209f4aa4

--- request headers ---
Accept: application/json
X-Fault-Key: e54f1e70-76d0-4143-adb3-1bf6d8a466c8
X-Fault: unavailable-once
X-Correlation-Id: qa-63abfe93-0129-4a0b-8b5f-cdcb209f4aa4
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63abfe93-0129-4a0b-8b5f-cdcb209f4aa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-63abfe93-0129-4a0b-8b5f-cdcb209f4aa4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1cf3aa1d-d86b-40c3-9354-2941e18bbafa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf3aa1d-d86b-40c3-9354-2941e18bbafa
Content-Type: application/json

--- request body ---
{"handle":"qa-cd2e28bb425e","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf3aa1d-d86b-40c3-9354-2941e18bbafa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd5bda0b-c29a-4ec4-bd71-63e39fe1729c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3365acf-bb38-4562-ab4d-589b758a0f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3365acf-bb38-4562-ab4d-589b758a0f49
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3365acf-bb38-4562-ab4d-589b758a0f49
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
correlation: qa-c4e61977-6fa7-438f-a7fd-0605dce55a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e61977-6fa7-438f-a7fd-0605dce55a2a
Content-Type: application/json

--- request body ---
{"handle":"qa-cd2e28bb425e","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4e61977-6fa7-438f-a7fd-0605dce55a2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4e61977-6fa7-438f-a7fd-0605dce55a2a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7fd54de-f567-4e5a-b82f-082146e59b82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7fd54de-f567-4e5a-b82f-082146e59b82
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7fd54de-f567-4e5a-b82f-082146e59b82
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
correlation: qa-8151d7c9-d74a-4693-ae25-2c63f5740d65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8151d7c9-d74a-4693-ae25-2c63f5740d65
Content-Type: application/json

--- request body ---
{"handle":"qa-31a6efc0af90","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8151d7c9-d74a-4693-ae25-2c63f5740d65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8151d7c9-d74a-4693-ae25-2c63f5740d65"}
```
