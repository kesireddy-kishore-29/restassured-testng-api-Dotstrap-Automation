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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-f6e41247-8e7f-4c07-9903-690fc9bd7446` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-2017aab7-1283-4a44-bae3-e8cd5f8140ab` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-ac8dfa66-7da6-4c17-8971-9d6d26724705` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-a4bd3722-d392-4ef7-a18a-0bb2ac420220` |
| 5 | `POST /v1/accounts` | 400 | 29 | `qa-9c3cbfd8-473b-42f7-be02-06bfe12eede3` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-976c961c-6ac8-4cc0-b939-a133502f74d8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-52b7a49c-3547-4989-ad17-af5ca185b389` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-d5d09a50-003d-436b-9bd6-380b84ae9068` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-9ca34317-48e6-4f03-8345-02f93d7765c7` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-42be12b4-2f2a-4318-9b58-2a16e5357dfb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6e41247-8e7f-4c07-9903-690fc9bd7446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e41247-8e7f-4c07-9903-690fc9bd7446
Content-Type: application/json

--- request body ---
{"handle":"qa-a61e52f71b50","displayName":"QA a61e52f71b50","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6e41247-8e7f-4c07-9903-690fc9bd7446
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-a61e52f71b50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ccbf9967-c725-411a-8b9f-806c7e0c732d","handle":"qa-a61e52f71b50","displayName":"QA a61e52f71b50","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.621774064Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2017aab7-1283-4a44-bae3-e8cd5f8140ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2017aab7-1283-4a44-bae3-e8cd5f8140ab
Content-Type: application/json

--- request body ---
{"handle":"qa-43713ae8f4df","displayName":"QA 43713ae8f4df","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2017aab7-1283-4a44-bae3-e8cd5f8140ab
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
Location: /v1/accounts/qa-43713ae8f4df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_769ef71e-7fc6-4666-967e-8e8cf730ef94","handle":"qa-43713ae8f4df","displayName":"QA 43713ae8f4df","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.655684475Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ac8dfa66-7da6-4c17-8971-9d6d26724705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8dfa66-7da6-4c17-8971-9d6d26724705
Content-Type: application/json

--- request body ---
{"handle":"qa-a61e52f71b50","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8dfa66-7da6-4c17-8971-9d6d26724705
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ccbf9967-c725-411a-8b9f-806c7e0c732d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a4bd3722-d392-4ef7-a18a-0bb2ac420220

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4bd3722-d392-4ef7-a18a-0bb2ac420220
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-43713ae8f4df","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4bd3722-d392-4ef7-a18a-0bb2ac420220
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
Location: /v1/conversations/cnv_ae21d950-4304-41aa-bfe3-eaef0d5f0d71
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae21d950-4304-41aa-bfe3-eaef0d5f0d71","subject":"Error contract","status":"open","region":"eu","participants":["qa-a61e52f71b50","qa-43713ae8f4df"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.743973543Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-9c3cbfd8-473b-42f7-be02-06bfe12eede3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c3cbfd8-473b-42f7-be02-06bfe12eede3
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c3cbfd8-473b-42f7-be02-06bfe12eede3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-9c3cbfd8-473b-42f7-be02-06bfe12eede3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-976c961c-6ac8-4cc0-b939-a133502f74d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-976c961c-6ac8-4cc0-b939-a133502f74d8
Content-Type: application/json

--- request body ---
{"handle":"qa-43713ae8f4df","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-976c961c-6ac8-4cc0-b939-a133502f74d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_769ef71e-7fc6-4666-967e-8e8cf730ef94"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-52b7a49c-3547-4989-ad17-af5ca185b389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52b7a49c-3547-4989-ad17-af5ca185b389
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-52b7a49c-3547-4989-ad17-af5ca185b389
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
correlation: qa-d5d09a50-003d-436b-9bd6-380b84ae9068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5d09a50-003d-436b-9bd6-380b84ae9068
Content-Type: application/json

--- request body ---
{"handle":"qa-43713ae8f4df","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5d09a50-003d-436b-9bd6-380b84ae9068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5d09a50-003d-436b-9bd6-380b84ae9068"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ca34317-48e6-4f03-8345-02f93d7765c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca34317-48e6-4f03-8345-02f93d7765c7
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ca34317-48e6-4f03-8345-02f93d7765c7
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
correlation: qa-42be12b4-2f2a-4318-9b58-2a16e5357dfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42be12b4-2f2a-4318-9b58-2a16e5357dfb
Content-Type: application/json

--- request body ---
{"handle":"qa-a61e52f71b50","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42be12b4-2f2a-4318-9b58-2a16e5357dfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42be12b4-2f2a-4318-9b58-2a16e5357dfb"}
```
