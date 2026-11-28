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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-12a2f1e3-1f6a-4402-b73e-95cbedaf98db` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-37c51cdd-c70f-4e22-a2e6-081e23960640` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-776bbe0d-b9bc-466a-bb14-e155ea3f2932` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-fc7ec55e-efab-4198-bb89-f3e3b9911c4b` |
| 5 | `POST /v1/auth/token` | 400 | 8 | `qa-19c1e2c3-5a83-4c57-9375-36a688721c0c` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-0aa6196f-880b-4c1b-b153-1b50e05cbd88` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-58cd67de-59c4-484d-80ed-a9be4fb1c888` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-5b0765b2-e6a6-49c6-b52a-301212870803` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4e6f86cb-9f47-408b-9dc5-5c75f8066823` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-36e976c5-b4a7-4bc4-9ac9-7a7e63c38da3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12a2f1e3-1f6a-4402-b73e-95cbedaf98db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12a2f1e3-1f6a-4402-b73e-95cbedaf98db
Content-Type: application/json

--- request body ---
{"handle":"qa-a036f2a8d4a0","displayName":"QA a036f2a8d4a0","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-12a2f1e3-1f6a-4402-b73e-95cbedaf98db
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
Location: /v1/accounts/qa-a036f2a8d4a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7cca3ef4-e03b-4384-a3a0-90dfff42b908","handle":"qa-a036f2a8d4a0","displayName":"QA a036f2a8d4a0","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.391030147Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37c51cdd-c70f-4e22-a2e6-081e23960640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c51cdd-c70f-4e22-a2e6-081e23960640
Content-Type: application/json

--- request body ---
{"handle":"qa-cf42897df8ee","displayName":"QA cf42897df8ee","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-37c51cdd-c70f-4e22-a2e6-081e23960640
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-cf42897df8ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da1ff8e0-c9ad-4def-98bd-02072e1330cf","handle":"qa-cf42897df8ee","displayName":"QA cf42897df8ee","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.441813879Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-776bbe0d-b9bc-466a-bb14-e155ea3f2932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776bbe0d-b9bc-466a-bb14-e155ea3f2932
Content-Type: application/json

--- request body ---
{"handle":"qa-a036f2a8d4a0","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-776bbe0d-b9bc-466a-bb14-e155ea3f2932
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7cca3ef4-e03b-4384-a3a0-90dfff42b908"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fc7ec55e-efab-4198-bb89-f3e3b9911c4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc7ec55e-efab-4198-bb89-f3e3b9911c4b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf42897df8ee","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc7ec55e-efab-4198-bb89-f3e3b9911c4b
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
Location: /v1/conversations/cnv_677fb0e0-902f-4c09-ada5-bf5456d684d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_677fb0e0-902f-4c09-ada5-bf5456d684d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-a036f2a8d4a0","qa-cf42897df8ee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.504842568Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-19c1e2c3-5a83-4c57-9375-36a688721c0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19c1e2c3-5a83-4c57-9375-36a688721c0c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19c1e2c3-5a83-4c57-9375-36a688721c0c
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
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-19c1e2c3-5a83-4c57-9375-36a688721c0c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0aa6196f-880b-4c1b-b153-1b50e05cbd88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa6196f-880b-4c1b-b153-1b50e05cbd88
Content-Type: application/json

--- request body ---
{"handle":"qa-cf42897df8ee","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0aa6196f-880b-4c1b-b153-1b50e05cbd88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da1ff8e0-c9ad-4def-98bd-02072e1330cf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58cd67de-59c4-484d-80ed-a9be4fb1c888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58cd67de-59c4-484d-80ed-a9be4fb1c888
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58cd67de-59c4-484d-80ed-a9be4fb1c888
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
correlation: qa-5b0765b2-e6a6-49c6-b52a-301212870803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b0765b2-e6a6-49c6-b52a-301212870803
Content-Type: application/json

--- request body ---
{"handle":"qa-cf42897df8ee","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b0765b2-e6a6-49c6-b52a-301212870803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b0765b2-e6a6-49c6-b52a-301212870803"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4e6f86cb-9f47-408b-9dc5-5c75f8066823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e6f86cb-9f47-408b-9dc5-5c75f8066823
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4e6f86cb-9f47-408b-9dc5-5c75f8066823
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
correlation: qa-36e976c5-b4a7-4bc4-9ac9-7a7e63c38da3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e976c5-b4a7-4bc4-9ac9-7a7e63c38da3
Content-Type: application/json

--- request body ---
{"handle":"qa-a036f2a8d4a0","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36e976c5-b4a7-4bc4-9ac9-7a7e63c38da3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36e976c5-b4a7-4bc4-9ac9-7a7e63c38da3"}
```
