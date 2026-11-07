# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 674 | `qa-11c6c7e5-3fe7-44ea-a353-32be38ec2625` |
| 2 | `POST /v1/accounts` | 201 | 121 | `qa-bc7bbc7a-f7a9-4c12-8b3e-5edf959bcb34` |
| 3 | `POST /v1/auth/token` | 200 | 68 | `qa-4c515c49-71b6-4c07-99fd-f3c6b8245bb1` |
| 4 | `POST /v1/conversations` | 201 | 115 | `qa-7f214c72-bd19-4643-8eb4-f00d37933923` |
| 5 | `POST /v1/auth/token` | 400 | 30 | `qa-b55143df-079b-48ea-ab73-613876a87192` |
| 6 | `POST /v1/auth/token` | 200 | 83 | `qa-892c038a-7649-4475-8d90-649262b1d8db` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-e99bbc84-4caf-4b6c-b976-09e6aa2eb18d` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-e7012d91-58af-4bda-9649-b511d2c19ce8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-4f1d95bb-2cb0-4bb4-b4cc-a55ab9e05d5e` |
| 10 | `POST /v1/auth/token` | 401 | 50 | `qa-d324dcb9-798f-474d-b464-c992c5ee6a8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-11c6c7e5-3fe7-44ea-a353-32be38ec2625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c6c7e5-3fe7-44ea-a353-32be38ec2625
Content-Type: application/json

--- request body ---
{"handle":"qa-441bd54e4c8c","displayName":"QA 441bd54e4c8c","password":"****","region":"eu"}

--- response: 201 in 674 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-11c6c7e5-3fe7-44ea-a353-32be38ec2625
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-441bd54e4c8c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35bb2388-18ff-4aed-9f0b-7d80d8c99a36","handle":"qa-441bd54e4c8c","displayName":"QA 441bd54e4c8c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.899525676Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bc7bbc7a-f7a9-4c12-8b3e-5edf959bcb34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc7bbc7a-f7a9-4c12-8b3e-5edf959bcb34
Content-Type: application/json

--- request body ---
{"handle":"qa-35620c4b705b","displayName":"QA 35620c4b705b","password":"****","region":"eu"}

--- response: 201 in 121 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc7bbc7a-f7a9-4c12-8b3e-5edf959bcb34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-35620c4b705b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea7cecd2-a07f-4126-8e3c-cd4296fc645a","handle":"qa-35620c4b705b","displayName":"QA 35620c4b705b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.347908515Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4c515c49-71b6-4c07-99fd-f3c6b8245bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c515c49-71b6-4c07-99fd-f3c6b8245bb1
Content-Type: application/json

--- request body ---
{"handle":"qa-441bd54e4c8c","password":"****"}

--- response: 200 in 68 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c515c49-71b6-4c07-99fd-f3c6b8245bb1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35bb2388-18ff-4aed-9f0b-7d80d8c99a36"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7f214c72-bd19-4643-8eb4-f00d37933923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f214c72-bd19-4643-8eb4-f00d37933923
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-35620c4b705b","subject":"Error contract","message":"Hi"}

--- response: 201 in 115 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f214c72-bd19-4643-8eb4-f00d37933923
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
Location: /v1/conversations/cnv_26198f16-e668-42cc-847e-79e569227e68
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26198f16-e668-42cc-847e-79e569227e68","subject":"Error contract","status":"open","region":"eu","participants":["qa-441bd54e4c8c","qa-35620c4b705b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.574998547Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b55143df-079b-48ea-ab73-613876a87192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55143df-079b-48ea-ab73-613876a87192
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b55143df-079b-48ea-ab73-613876a87192
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
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-b55143df-079b-48ea-ab73-613876a87192"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-892c038a-7649-4475-8d90-649262b1d8db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-892c038a-7649-4475-8d90-649262b1d8db
Content-Type: application/json

--- request body ---
{"handle":"qa-35620c4b705b","password":"****"}

--- response: 200 in 83 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-892c038a-7649-4475-8d90-649262b1d8db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea7cecd2-a07f-4126-8e3c-cd4296fc645a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e99bbc84-4caf-4b6c-b976-09e6aa2eb18d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e99bbc84-4caf-4b6c-b976-09e6aa2eb18d
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e99bbc84-4caf-4b6c-b976-09e6aa2eb18d
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
correlation: qa-e7012d91-58af-4bda-9649-b511d2c19ce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7012d91-58af-4bda-9649-b511d2c19ce8
Content-Type: application/json

--- request body ---
{"handle":"qa-35620c4b705b","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7012d91-58af-4bda-9649-b511d2c19ce8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7012d91-58af-4bda-9649-b511d2c19ce8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f1d95bb-2cb0-4bb4-b4cc-a55ab9e05d5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f1d95bb-2cb0-4bb4-b4cc-a55ab9e05d5e
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f1d95bb-2cb0-4bb4-b4cc-a55ab9e05d5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d324dcb9-798f-474d-b464-c992c5ee6a8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d324dcb9-798f-474d-b464-c992c5ee6a8c
Content-Type: application/json

--- request body ---
{"handle":"qa-441bd54e4c8c","password":"****"}

--- response: 401 in 50 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d324dcb9-798f-474d-b464-c992c5ee6a8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d324dcb9-798f-474d-b464-c992c5ee6a8c"}
```
