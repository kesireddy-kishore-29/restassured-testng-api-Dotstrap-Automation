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
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-97593dfc-a6ef-4650-b6f3-225dfedfff0e` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-0a647ec4-f9e5-412b-8a45-808d24827407` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-3ea86aef-340e-4deb-93e0-6216b41d4cb4` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-248aca74-a59b-44e9-b33c-52bb39e83b72` |
| 5 | `POST /v1/auth/token` | 400 | 10 | `qa-578fd9ee-bca2-4da2-8104-968c61634cb1` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-cf939d57-8039-4b65-96ed-a9b6143c26c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-e341cff1-92ea-41da-91d4-d7817a0d27d6` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-dbb281c9-c00e-40bf-a76d-ad8fb89e74b0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-dc963706-dba9-4fe9-a50b-e2006d5f22ff` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-6ba6fe58-fbf7-4367-a649-fd99337314c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97593dfc-a6ef-4650-b6f3-225dfedfff0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97593dfc-a6ef-4650-b6f3-225dfedfff0e
Content-Type: application/json

--- request body ---
{"handle":"qa-cd9c0b624108","displayName":"QA cd9c0b624108","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-97593dfc-a6ef-4650-b6f3-225dfedfff0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-cd9c0b624108
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc4c3a02-76b3-481d-b49e-921c1f7abbb0","handle":"qa-cd9c0b624108","displayName":"QA cd9c0b624108","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.849142977Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a647ec4-f9e5-412b-8a45-808d24827407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a647ec4-f9e5-412b-8a45-808d24827407
Content-Type: application/json

--- request body ---
{"handle":"qa-84fcccd342f8","displayName":"QA 84fcccd342f8","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a647ec4-f9e5-412b-8a45-808d24827407
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-84fcccd342f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd119561-a8cb-4b42-a349-af62dac50303","handle":"qa-84fcccd342f8","displayName":"QA 84fcccd342f8","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.896239292Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3ea86aef-340e-4deb-93e0-6216b41d4cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ea86aef-340e-4deb-93e0-6216b41d4cb4
Content-Type: application/json

--- request body ---
{"handle":"qa-cd9c0b624108","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ea86aef-340e-4deb-93e0-6216b41d4cb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc4c3a02-76b3-481d-b49e-921c1f7abbb0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-248aca74-a59b-44e9-b33c-52bb39e83b72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-248aca74-a59b-44e9-b33c-52bb39e83b72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-84fcccd342f8","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-248aca74-a59b-44e9-b33c-52bb39e83b72
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
Location: /v1/conversations/cnv_5dc4ddbb-feb9-4eb9-88c4-e92d88e04d79
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5dc4ddbb-feb9-4eb9-88c4-e92d88e04d79","subject":"Error contract","status":"open","region":"eu","participants":["qa-cd9c0b624108","qa-84fcccd342f8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.986982330Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-578fd9ee-bca2-4da2-8104-968c61634cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-578fd9ee-bca2-4da2-8104-968c61634cb1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-578fd9ee-bca2-4da2-8104-968c61634cb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-578fd9ee-bca2-4da2-8104-968c61634cb1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cf939d57-8039-4b65-96ed-a9b6143c26c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf939d57-8039-4b65-96ed-a9b6143c26c1
Content-Type: application/json

--- request body ---
{"handle":"qa-84fcccd342f8","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf939d57-8039-4b65-96ed-a9b6143c26c1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd119561-a8cb-4b42-a349-af62dac50303"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e341cff1-92ea-41da-91d4-d7817a0d27d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e341cff1-92ea-41da-91d4-d7817a0d27d6
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e341cff1-92ea-41da-91d4-d7817a0d27d6
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
correlation: qa-dbb281c9-c00e-40bf-a76d-ad8fb89e74b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbb281c9-c00e-40bf-a76d-ad8fb89e74b0
Content-Type: application/json

--- request body ---
{"handle":"qa-84fcccd342f8","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbb281c9-c00e-40bf-a76d-ad8fb89e74b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dbb281c9-c00e-40bf-a76d-ad8fb89e74b0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc963706-dba9-4fe9-a50b-e2006d5f22ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc963706-dba9-4fe9-a50b-e2006d5f22ff
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc963706-dba9-4fe9-a50b-e2006d5f22ff
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
correlation: qa-6ba6fe58-fbf7-4367-a649-fd99337314c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba6fe58-fbf7-4367-a649-fd99337314c3
Content-Type: application/json

--- request body ---
{"handle":"qa-cd9c0b624108","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ba6fe58-fbf7-4367-a649-fd99337314c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ba6fe58-fbf7-4367-a649-fd99337314c3"}
```
