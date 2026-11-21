# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 535 | `qa-d53c515b-0f43-41d4-8fab-ebf9bac63968` |
| 2 | `POST /v1/auth/token` | 200 | 91 | `qa-e412fb3f-1f6c-430a-bf99-9199bfe8605f` |
| 3 | `GET /v1/conversations/{id}` | 404 | 98 | `qa-06924da2-aab5-4f02-8e95-0b53842ea629` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 17 | `qa-dff52e46-903d-4060-82cd-b6004ea94f6f` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-09982b0b-0dd4-407f-a503-c2c0c6a6fd41` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-6f68510d-0277-4652-8533-862f58530b5c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d53c515b-0f43-41d4-8fab-ebf9bac63968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d53c515b-0f43-41d4-8fab-ebf9bac63968
Content-Type: application/json

--- request body ---
{"handle":"qa-24e03903614e","displayName":"QA 24e03903614e","password":"****","region":"eu"}

--- response: 201 in 535 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d53c515b-0f43-41d4-8fab-ebf9bac63968
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
Location: /v1/accounts/qa-24e03903614e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e580329-a6d3-4ec2-b062-0c3b7164b88d","handle":"qa-24e03903614e","displayName":"QA 24e03903614e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.642800624Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e412fb3f-1f6c-430a-bf99-9199bfe8605f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e412fb3f-1f6c-430a-bf99-9199bfe8605f
Content-Type: application/json

--- request body ---
{"handle":"qa-24e03903614e","password":"****"}

--- response: 200 in 91 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-e412fb3f-1f6c-430a-bf99-9199bfe8605f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e580329-a6d3-4ec2-b062-0c3b7164b88d"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-06924da2-aab5-4f02-8e95-0b53842ea629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06924da2-aab5-4f02-8e95-0b53842ea629
Content-Type: application/json

--- response: 404 in 98 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06924da2-aab5-4f02-8e95-0b53842ea629
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-06924da2-aab5-4f02-8e95-0b53842ea629"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-dff52e46-903d-4060-82cd-b6004ea94f6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff52e46-903d-4060-82cd-b6004ea94f6f
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dff52e46-903d-4060-82cd-b6004ea94f6f
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-dff52e46-903d-4060-82cd-b6004ea94f6f"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09982b0b-0dd4-407f-a503-c2c0c6a6fd41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09982b0b-0dd4-407f-a503-c2c0c6a6fd41
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09982b0b-0dd4-407f-a503-c2c0c6a6fd41
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6f68510d-0277-4652-8533-862f58530b5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f68510d-0277-4652-8533-862f58530b5c
Content-Type: application/json

--- request body ---
{"handle":"qa-24e03903614e","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f68510d-0277-4652-8533-862f58530b5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f68510d-0277-4652-8533-862f58530b5c"}
```
