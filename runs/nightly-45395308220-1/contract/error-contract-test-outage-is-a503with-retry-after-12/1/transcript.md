# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-8fbac106-fdc8-45c1-b103-3f61b2d32fe7` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-c379bc98-9dfb-4429-add1-7be074f726f0` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-6e40cb50-c18a-42a5-8c9c-d99ed405e973` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-27f2fdb0-ce92-4760-bc18-6fa62beb80b9` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 33 | `qa-ed989ebb-8293-4de4-9c6a-3e7ccb0c3f71` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-4fb29fb5-f8b8-4e77-a733-635c7061167f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-80124cca-cbd9-4380-81ce-02605e2a6883` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-67e62ed6-a4e1-4195-af60-fae34f5273bd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ab40eead-e7af-4bcf-96b8-7cbd80b736a3` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-f953c0d9-2fa0-4f7f-aff9-0481942c120d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fbac106-fdc8-45c1-b103-3f61b2d32fe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fbac106-fdc8-45c1-b103-3f61b2d32fe7
Content-Type: application/json

--- request body ---
{"handle":"qa-e3c45144f627","displayName":"QA e3c45144f627","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fbac106-fdc8-45c1-b103-3f61b2d32fe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-e3c45144f627
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20a53bbc-e2fd-4239-8829-0fb7e3b0d561","handle":"qa-e3c45144f627","displayName":"QA e3c45144f627","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.450639859Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c379bc98-9dfb-4429-add1-7be074f726f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c379bc98-9dfb-4429-add1-7be074f726f0
Content-Type: application/json

--- request body ---
{"handle":"qa-ad50094583f6","displayName":"QA ad50094583f6","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c379bc98-9dfb-4429-add1-7be074f726f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-ad50094583f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ac7ec30-7288-4e41-a479-a01075dab587","handle":"qa-ad50094583f6","displayName":"QA ad50094583f6","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.479424235Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6e40cb50-c18a-42a5-8c9c-d99ed405e973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e40cb50-c18a-42a5-8c9c-d99ed405e973
Content-Type: application/json

--- request body ---
{"handle":"qa-e3c45144f627","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e40cb50-c18a-42a5-8c9c-d99ed405e973
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20a53bbc-e2fd-4239-8829-0fb7e3b0d561"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-27f2fdb0-ce92-4760-bc18-6fa62beb80b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27f2fdb0-ce92-4760-bc18-6fa62beb80b9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ad50094583f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-27f2fdb0-ce92-4760-bc18-6fa62beb80b9
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
Location: /v1/conversations/cnv_422464af-5226-4a8c-a9b8-514a39488b55
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_422464af-5226-4a8c-a9b8-514a39488b55","subject":"Error contract","status":"open","region":"eu","participants":["qa-e3c45144f627","qa-ad50094583f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.533383589Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_422464af-5226-4a8c-a9b8-514a39488b55/close
correlation: qa-ed989ebb-8293-4de4-9c6a-3e7ccb0c3f71

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: aa30691c-040d-4e11-8a9a-010b4ee7d45d
X-Correlation-Id: qa-ed989ebb-8293-4de4-9c6a-3e7ccb0c3f71
Content-Type: application/json

--- response: 503 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed989ebb-8293-4de4-9c6a-3e7ccb0c3f71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_422464af-5226-4a8c-a9b8-514a39488b55/close","correlationId":"qa-ed989ebb-8293-4de4-9c6a-3e7ccb0c3f71"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4fb29fb5-f8b8-4e77-a733-635c7061167f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fb29fb5-f8b8-4e77-a733-635c7061167f
Content-Type: application/json

--- request body ---
{"handle":"qa-ad50094583f6","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fb29fb5-f8b8-4e77-a733-635c7061167f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ac7ec30-7288-4e41-a479-a01075dab587"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80124cca-cbd9-4380-81ce-02605e2a6883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80124cca-cbd9-4380-81ce-02605e2a6883
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80124cca-cbd9-4380-81ce-02605e2a6883
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
correlation: qa-67e62ed6-a4e1-4195-af60-fae34f5273bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e62ed6-a4e1-4195-af60-fae34f5273bd
Content-Type: application/json

--- request body ---
{"handle":"qa-ad50094583f6","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67e62ed6-a4e1-4195-af60-fae34f5273bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67e62ed6-a4e1-4195-af60-fae34f5273bd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab40eead-e7af-4bcf-96b8-7cbd80b736a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab40eead-e7af-4bcf-96b8-7cbd80b736a3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab40eead-e7af-4bcf-96b8-7cbd80b736a3
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
correlation: qa-f953c0d9-2fa0-4f7f-aff9-0481942c120d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f953c0d9-2fa0-4f7f-aff9-0481942c120d
Content-Type: application/json

--- request body ---
{"handle":"qa-e3c45144f627","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f953c0d9-2fa0-4f7f-aff9-0481942c120d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f953c0d9-2fa0-4f7f-aff9-0481942c120d"}
```
