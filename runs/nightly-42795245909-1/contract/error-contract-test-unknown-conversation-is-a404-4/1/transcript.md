# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-0107d093-bec2-49a9-86b1-c31215d1fdb8` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-c87a900f-a514-41b4-9054-96c237631baa` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 15 | `qa-40c8bf50-7c25-423f-95b1-9df034305257` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8c267cd7-1ad8-4019-ad29-a5bac42d87be` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-f5b73fb4-272e-4826-a529-efbec9edf9a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0107d093-bec2-49a9-86b1-c31215d1fdb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0107d093-bec2-49a9-86b1-c31215d1fdb8
Content-Type: application/json

--- request body ---
{"handle":"qa-cc068eb6e1b8","displayName":"QA cc068eb6e1b8","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0107d093-bec2-49a9-86b1-c31215d1fdb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Location: /v1/accounts/qa-cc068eb6e1b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79014708-747e-4550-b08f-a326a44c0db2","handle":"qa-cc068eb6e1b8","displayName":"QA cc068eb6e1b8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.018775448Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c87a900f-a514-41b4-9054-96c237631baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87a900f-a514-41b4-9054-96c237631baa
Content-Type: application/json

--- request body ---
{"handle":"qa-cc068eb6e1b8","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c87a900f-a514-41b4-9054-96c237631baa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79014708-747e-4550-b08f-a326a44c0db2"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-40c8bf50-7c25-423f-95b1-9df034305257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c8bf50-7c25-423f-95b1-9df034305257
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40c8bf50-7c25-423f-95b1-9df034305257
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-40c8bf50-7c25-423f-95b1-9df034305257"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c267cd7-1ad8-4019-ad29-a5bac42d87be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c267cd7-1ad8-4019-ad29-a5bac42d87be
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c267cd7-1ad8-4019-ad29-a5bac42d87be
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f5b73fb4-272e-4826-a529-efbec9edf9a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b73fb4-272e-4826-a529-efbec9edf9a1
Content-Type: application/json

--- request body ---
{"handle":"qa-cc068eb6e1b8","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5b73fb4-272e-4826-a529-efbec9edf9a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5b73fb4-272e-4826-a529-efbec9edf9a1"}
```
