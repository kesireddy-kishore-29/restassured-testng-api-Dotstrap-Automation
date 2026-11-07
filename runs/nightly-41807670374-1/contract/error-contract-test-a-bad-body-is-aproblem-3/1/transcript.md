# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 434 | `qa-9894e24d-f94a-4bc0-8f55-7e920835b63c` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-92fe8a77-220e-4c97-9fbf-dd0cc5cb1c4a` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-78c2cb62-3bbd-4ef1-b184-c766e9d67dae` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-2572d4a8-9a0c-438f-8533-182e536f9170` |
| 5 | `POST /v1/accounts` | 400 | 13 | `qa-c1d82228-d57d-4bb6-a43c-a2d35a18d29b` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-b8ffd852-c9b8-4f18-ae53-5cf70c656e6b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-5457d219-7616-4a96-b2e7-a71b3830024e` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-6aebe357-cbeb-4b55-b4f9-b2067f159948` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-cf8fdf81-0067-4214-ae49-b9e05d01a94e` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-d69a945b-b89c-4b9c-adaa-50aa2954002c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9894e24d-f94a-4bc0-8f55-7e920835b63c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9894e24d-f94a-4bc0-8f55-7e920835b63c
Content-Type: application/json

--- request body ---
{"handle":"qa-14d298ab816a","displayName":"QA 14d298ab816a","password":"****","region":"eu"}

--- response: 201 in 434 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9894e24d-f94a-4bc0-8f55-7e920835b63c
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
Location: /v1/accounts/qa-14d298ab816a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_217518f7-ca0a-4498-a788-7bbba7e34a76","handle":"qa-14d298ab816a","displayName":"QA 14d298ab816a","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.115686380Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92fe8a77-220e-4c97-9fbf-dd0cc5cb1c4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92fe8a77-220e-4c97-9fbf-dd0cc5cb1c4a
Content-Type: application/json

--- request body ---
{"handle":"qa-24ccb0e11853","displayName":"QA 24ccb0e11853","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-92fe8a77-220e-4c97-9fbf-dd0cc5cb1c4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-24ccb0e11853
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96152361-0ffb-42ea-a0c0-5c1a9eb3d55a","handle":"qa-24ccb0e11853","displayName":"QA 24ccb0e11853","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.391290014Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78c2cb62-3bbd-4ef1-b184-c766e9d67dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78c2cb62-3bbd-4ef1-b184-c766e9d67dae
Content-Type: application/json

--- request body ---
{"handle":"qa-14d298ab816a","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-78c2cb62-3bbd-4ef1-b184-c766e9d67dae
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_217518f7-ca0a-4498-a788-7bbba7e34a76"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2572d4a8-9a0c-438f-8533-182e536f9170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2572d4a8-9a0c-438f-8533-182e536f9170
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24ccb0e11853","subject":"Error contract","message":"Hi"}

--- response: 201 in 51 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2572d4a8-9a0c-438f-8533-182e536f9170
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
Location: /v1/conversations/cnv_a7edf65a-0e21-45e3-a872-d6056f0e09af
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a7edf65a-0e21-45e3-a872-d6056f0e09af","subject":"Error contract","status":"open","region":"eu","participants":["qa-14d298ab816a","qa-24ccb0e11853"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.531791207Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c1d82228-d57d-4bb6-a43c-a2d35a18d29b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1d82228-d57d-4bb6-a43c-a2d35a18d29b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1d82228-d57d-4bb6-a43c-a2d35a18d29b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-c1d82228-d57d-4bb6-a43c-a2d35a18d29b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b8ffd852-c9b8-4f18-ae53-5cf70c656e6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ffd852-c9b8-4f18-ae53-5cf70c656e6b
Content-Type: application/json

--- request body ---
{"handle":"qa-24ccb0e11853","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8ffd852-c9b8-4f18-ae53-5cf70c656e6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96152361-0ffb-42ea-a0c0-5c1a9eb3d55a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5457d219-7616-4a96-b2e7-a71b3830024e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5457d219-7616-4a96-b2e7-a71b3830024e
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5457d219-7616-4a96-b2e7-a71b3830024e
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
correlation: qa-6aebe357-cbeb-4b55-b4f9-b2067f159948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aebe357-cbeb-4b55-b4f9-b2067f159948
Content-Type: application/json

--- request body ---
{"handle":"qa-24ccb0e11853","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6aebe357-cbeb-4b55-b4f9-b2067f159948
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6aebe357-cbeb-4b55-b4f9-b2067f159948"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf8fdf81-0067-4214-ae49-b9e05d01a94e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf8fdf81-0067-4214-ae49-b9e05d01a94e
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf8fdf81-0067-4214-ae49-b9e05d01a94e
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
correlation: qa-d69a945b-b89c-4b9c-adaa-50aa2954002c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d69a945b-b89c-4b9c-adaa-50aa2954002c
Content-Type: application/json

--- request body ---
{"handle":"qa-14d298ab816a","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d69a945b-b89c-4b9c-adaa-50aa2954002c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d69a945b-b89c-4b9c-adaa-50aa2954002c"}
```
