# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-cdeb237b-3fc2-4769-b54c-2a68c4b3ffca` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-cf6b7021-cb70-4382-b7cc-849e6ad59723` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-91b64952-9f72-4564-bd35-c0fbd9b9406d` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-7176dfbd-8233-4f66-9a9d-8786ad35b66f` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 16 | `qa-9b2cebeb-7789-49a3-a6fe-f3f309b8dc26` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-92ca4fa0-0663-4b61-bff3-9b433e9946c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-18d7f47e-3ec1-4d61-996b-b02e674f5642` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-68ff959e-110d-4002-93d5-f44957489945` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-98ca289c-3046-4836-b11f-39458c56e271` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-cfb42716-f95f-4096-a722-d808ab1905e2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cdeb237b-3fc2-4769-b54c-2a68c4b3ffca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdeb237b-3fc2-4769-b54c-2a68c4b3ffca
Content-Type: application/json

--- request body ---
{"handle":"qa-11100e099e2e","displayName":"QA 11100e099e2e","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdeb237b-3fc2-4769-b54c-2a68c4b3ffca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-11100e099e2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05f0c388-540c-4cb2-864a-bc327d9450d6","handle":"qa-11100e099e2e","displayName":"QA 11100e099e2e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.088619466Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cf6b7021-cb70-4382-b7cc-849e6ad59723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6b7021-cb70-4382-b7cc-849e6ad59723
Content-Type: application/json

--- request body ---
{"handle":"qa-41b50c7cac2e","displayName":"QA 41b50c7cac2e","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf6b7021-cb70-4382-b7cc-849e6ad59723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Location: /v1/accounts/qa-41b50c7cac2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8524e70c-ddf5-429c-8161-06a5c034e538","handle":"qa-41b50c7cac2e","displayName":"QA 41b50c7cac2e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.159270808Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-91b64952-9f72-4564-bd35-c0fbd9b9406d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91b64952-9f72-4564-bd35-c0fbd9b9406d
Content-Type: application/json

--- request body ---
{"handle":"qa-11100e099e2e","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-91b64952-9f72-4564-bd35-c0fbd9b9406d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05f0c388-540c-4cb2-864a-bc327d9450d6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7176dfbd-8233-4f66-9a9d-8786ad35b66f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7176dfbd-8233-4f66-9a9d-8786ad35b66f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-41b50c7cac2e","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7176dfbd-8233-4f66-9a9d-8786ad35b66f
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
Location: /v1/conversations/cnv_2fbea103-dc96-4961-bb87-c78b5de63a1e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2fbea103-dc96-4961-bb87-c78b5de63a1e","subject":"Error contract","status":"open","region":"eu","participants":["qa-11100e099e2e","qa-41b50c7cac2e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.266669856Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2fbea103-dc96-4961-bb87-c78b5de63a1e/messages
correlation: qa-9b2cebeb-7789-49a3-a6fe-f3f309b8dc26

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d097d126-d945-4652-b7af-59fa7e39e28a
X-Correlation-Id: qa-9b2cebeb-7789-49a3-a6fe-f3f309b8dc26
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b2cebeb-7789-49a3-a6fe-f3f309b8dc26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2fbea103-dc96-4961-bb87-c78b5de63a1e/messages","correlationId":"qa-9b2cebeb-7789-49a3-a6fe-f3f309b8dc26"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-92ca4fa0-0663-4b61-bff3-9b433e9946c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ca4fa0-0663-4b61-bff3-9b433e9946c2
Content-Type: application/json

--- request body ---
{"handle":"qa-41b50c7cac2e","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-92ca4fa0-0663-4b61-bff3-9b433e9946c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8524e70c-ddf5-429c-8161-06a5c034e538"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18d7f47e-3ec1-4d61-996b-b02e674f5642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d7f47e-3ec1-4d61-996b-b02e674f5642
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18d7f47e-3ec1-4d61-996b-b02e674f5642
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
correlation: qa-68ff959e-110d-4002-93d5-f44957489945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ff959e-110d-4002-93d5-f44957489945
Content-Type: application/json

--- request body ---
{"handle":"qa-41b50c7cac2e","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68ff959e-110d-4002-93d5-f44957489945
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68ff959e-110d-4002-93d5-f44957489945"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98ca289c-3046-4836-b11f-39458c56e271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ca289c-3046-4836-b11f-39458c56e271
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98ca289c-3046-4836-b11f-39458c56e271
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
correlation: qa-cfb42716-f95f-4096-a722-d808ab1905e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb42716-f95f-4096-a722-d808ab1905e2
Content-Type: application/json

--- request body ---
{"handle":"qa-11100e099e2e","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfb42716-f95f-4096-a722-d808ab1905e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cfb42716-f95f-4096-a722-d808ab1905e2"}
```
