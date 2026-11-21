# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 277 | `qa-35b17f25-38e9-4c3a-9541-46298048503f` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-d0d4e2c5-4c9b-45ab-b02e-45e5ca35036f` |
| 3 | `GET /v1/accounts/me` | 200 | 42 | `qa-4964cd43-3d16-4fb7-815d-f89e2cd785e1` |
| 4 | `GET /v1/accounts/me` | 200 | 21 | `qa-2efdd685-70e5-49f1-be39-6205423d2a24` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-e84e7c38-7e35-45cc-b38f-9873d5e1b9d5` |
| 6 | `GET /v1/accounts/me` | 200 | 15 | `qa-cd555d0e-ff71-453e-952d-f04d64532cba` |
| 7 | `GET /v1/accounts/me` | 200 | 7 | `qa-edd7e31b-8f8e-41ab-9b13-23e3afbb1a82` |
| 8 | `GET /v1/accounts/me` | 200 | 8 | `qa-14e4f6d5-b586-496c-8b85-5aabd1327d2f` |
| 9 | `GET /v1/accounts/me` | 200 | 9 | `qa-7aa4607c-03dc-4f22-a074-742aa323ecaf` |
| 10 | `GET /v1/accounts/me` | 200 | 18 | `qa-7162caab-abba-4645-9346-0b73db7ec75a` |
| 11 | `GET /v1/accounts/me` | 200 | 11 | `qa-b5bf606c-9575-4b44-9a7d-47d7e573ce3a` |
| 12 | `GET /v1/accounts/me` | 200 | 22 | `qa-092e29e4-dcc4-498c-9dee-fe7db0263456` |
| 13 | `GET /v1/accounts/me` | 200 | 7 | `qa-4420e710-4395-4f15-bee1-afaf2129b716` |
| 14 | `GET /v1/accounts/me` | 200 | 6 | `qa-75a463dd-a01a-4c9f-8378-cb03e918c99c` |
| 15 | `GET /v1/accounts/me` | 200 | 10 | `qa-2765f300-69c1-45d3-afbb-6774cf7933e7` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-d717733a-d75a-46a1-a3f5-dd85531b8dc4` |
| 17 | `GET /v1/accounts/me` | 200 | 9 | `qa-0c31aa47-080e-4d3e-8a52-182cf2279632` |
| 18 | `GET /v1/accounts/me` | 200 | 14 | `qa-654c3f19-03aa-478c-a9bd-704a82b5d104` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-d3fde8fc-6477-4bc9-a93a-42ea0ecd66a3` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-4afdf032-89b6-4bf8-9ec4-50a771a81f67` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-e1afd042-9a61-4de0-b340-7739f31cb898` |
| 22 | `GET /v1/accounts/me` | 200 | 9 | `qa-63db563d-524c-4092-bd4b-84e79b9d4aec` |
| 23 | `GET /v1/accounts/me` | 200 | 6 | `qa-63477bab-175f-4821-8aad-da1c051e4fcc` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-7c56f9af-0b43-4d60-9a39-a62742fa8368` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-b2f8e945-b3b7-4794-ac41-7d3834d30175` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-a4789514-c052-4bc7-a76c-c892812e08d2` |
| 27 | `GET /v1/accounts/me` | 200 | 10 | `qa-412e43ac-4ad8-43b9-ad0e-443d48d9e3f8` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-8bb6d5b2-f283-4e3b-b6c3-ec6c827c1aae` |
| 29 | `GET /v1/accounts/me` | 200 | 7 | `qa-f311ed6c-3c84-4d90-9943-26a40f85cfa2` |
| 30 | `GET /v1/accounts/me` | 200 | 5 | `qa-bad73ba5-41ce-4d9d-968c-1ca00c73dd84` |
| 31 | `GET /v1/accounts/me` | 200 | 5 | `qa-b0877d5d-47a9-49d0-b132-2a46571dd7f0` |
| 32 | `GET /v1/accounts/me` | 200 | 8 | `qa-d15998a0-5dbf-4a0e-98c5-0651fedcc92c` |
| 33 | `GET /v1/accounts/me` | 200 | 10 | `qa-e4d79c3e-38cc-425b-893e-ef33dba9abfd` |
| 34 | `GET /v1/accounts/me` | 200 | 8 | `qa-92cb6fb1-f69b-4fb7-993b-004916a68bc7` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-aeccfcfb-ecde-434a-86f4-c5163476d508` |
| 36 | `GET /v1/accounts/me` | 200 | 9 | `qa-24ef6213-8629-4bfb-b01b-ceb83b32afbb` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-eca87c87-12c1-4418-a207-28ddf4a5027b` |
| 38 | `GET /v1/accounts/me` | 200 | 9 | `qa-d9235967-326f-497e-a144-2489406a5711` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-840f4237-1d32-4665-9476-4e34f4d82a7b` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-87545c6a-da9f-4eb8-a0ae-3fb48d2e85a9` |
| 41 | `GET /v1/accounts/me` | 200 | 8 | `qa-4fa05b72-870f-432a-af81-d6953326e412` |
| 42 | `GET /v1/accounts/me` | 200 | 20 | `qa-eaa67660-57de-42b9-8ea2-cddd2477e5db` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-967ebad0-c54e-4fcc-ad4c-524dd94cfe31` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-ddfe7c8f-614f-45d5-b036-768d81a4ebd9` |
| 45 | `GET /v1/accounts/me` | 200 | 9 | `qa-5c3ab420-4ce1-48f6-a553-094a34347286` |
| 46 | `GET /v1/accounts/me` | 200 | 4 | `qa-73a8e16e-4607-4bd2-af84-134c00bdaef2` |
| 47 | `GET /v1/accounts/me` | 200 | 5 | `qa-9e649e5e-b4bf-4857-a6f5-45d375c7d173` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-aa1f0cd2-8b5e-421e-8a3b-2309477e5efd` |
| 49 | `GET /v1/accounts/me` | 200 | 7 | `qa-1fd72aeb-528d-41e9-bf8e-63db60c603df` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-77aaab17-ca3a-43d3-b66c-9ea5213ba1b3` |
| 51 | `GET /v1/accounts/me` | 200 | 4 | `qa-cf846a6e-e496-4de1-8ac7-17d4ece4e38c` |
| 52 | `GET /v1/accounts/me` | 200 | 8 | `qa-55056a58-127b-4101-b071-a4a39a86ab14` |
| 53 | `GET /v1/accounts/me` | 200 | 4 | `qa-2aacd602-cbb2-41a2-9d4c-b9d77a762b28` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-04080894-ef65-447e-bc08-86e16ecf5fb5` |
| 55 | `GET /v1/accounts/me` | 200 | 5 | `qa-26dca19d-7191-4d23-807a-298e410ca355` |
| 56 | `GET /v1/accounts/me` | 200 | 4 | `qa-73b164fc-754e-4648-b242-b4839c285806` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-e42b8d66-eb07-491b-a5cb-e076dd370306` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-f75df214-99ff-4592-90b3-b4f15dc9583f` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-dce753c8-670c-40e5-a885-decc06b4348e` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-0a1f75be-7f0e-4f55-b3dd-bdc22da8a930` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-fe9e64d2-45be-48da-859c-9df2e64e4743` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-d1baa069-8770-4125-92a2-7ea136e576c7` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-fe3487ae-b415-43ab-8efc-78d08eb81383` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-4503e8ba-3106-4fee-966c-d2c306da31af` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-2f34b714-6453-4dac-9583-ca6626bc1c6b` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-fbfabc31-02e3-4974-8af8-475264eb5fbf` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-8040017a-6b6b-425c-81c6-170b415b641d` |
| 68 | `GET /v1/accounts/me` | 429 | 3 | `qa-1faa39ce-14e3-4d33-9fea-870ff3214172` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-72985e76-d84a-460d-bd67-8c6ee4c95f8b` |
| 70 | `GET /v1/accounts/me` | 429 | 3 | `qa-fa56c1bc-650f-4d79-8064-11b25d37c57c` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-12bbda02-40b9-4653-a79f-fca0cbd72df0` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-3b21bc1d-2f77-4ecf-8160-af886102b238` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-2070e57e-d419-42b9-a575-8eb51bdcd7ab` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-7e74bc52-67de-4744-a416-82a1cfa15fb2` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-440e6223-335e-4e33-9f8f-5755bb81d079` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-11c45541-ad13-4eec-9c2c-5ca78ed9dfd2` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-5805b7de-4776-4f5b-92b1-ae7455f3b549` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-1f1ee28d-787e-4d53-bd7f-c12875db88ea` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-654ecac1-235b-44e1-af6f-9a676a83cb1e` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-de124e5b-2f32-4c83-801d-00f896c5fa06` |
| 81 | `GET /v1/accounts/me` | 200 | 3 | `qa-1ad5aaa1-1bf6-4df1-a83a-f49a1b08364b` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f719ee10-9078-4b8d-8c3a-cdd8a363d882` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-6573ec42-407c-4041-bdbc-f93fdce6cfd0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35b17f25-38e9-4c3a-9541-46298048503f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35b17f25-38e9-4c3a-9541-46298048503f
Content-Type: application/json

--- request body ---
{"handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","password":"****","region":"eu"}

--- response: 201 in 277 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-35b17f25-38e9-4c3a-9541-46298048503f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-6fa1bb90161d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d0d4e2c5-4c9b-45ab-b02e-45e5ca35036f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0d4e2c5-4c9b-45ab-b02e-45e5ca35036f
Content-Type: application/json

--- request body ---
{"handle":"qa-6fa1bb90161d","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0d4e2c5-4c9b-45ab-b02e-45e5ca35036f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4964cd43-3d16-4fb7-815d-f89e2cd785e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4964cd43-3d16-4fb7-815d-f89e2cd785e1
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4964cd43-3d16-4fb7-815d-f89e2cd785e1
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
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2efdd685-70e5-49f1-be39-6205423d2a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2efdd685-70e5-49f1-be39-6205423d2a24
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2efdd685-70e5-49f1-be39-6205423d2a24
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
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e84e7c38-7e35-45cc-b38f-9873d5e1b9d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84e7c38-7e35-45cc-b38f-9873d5e1b9d5
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84e7c38-7e35-45cc-b38f-9873d5e1b9d5
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
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd555d0e-ff71-453e-952d-f04d64532cba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd555d0e-ff71-453e-952d-f04d64532cba
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd555d0e-ff71-453e-952d-f04d64532cba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-edd7e31b-8f8e-41ab-9b13-23e3afbb1a82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edd7e31b-8f8e-41ab-9b13-23e3afbb1a82
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-edd7e31b-8f8e-41ab-9b13-23e3afbb1a82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-14e4f6d5-b586-496c-8b85-5aabd1327d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e4f6d5-b586-496c-8b85-5aabd1327d2f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-14e4f6d5-b586-496c-8b85-5aabd1327d2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-7aa4607c-03dc-4f22-a074-742aa323ecaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aa4607c-03dc-4f22-a074-742aa323ecaf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7aa4607c-03dc-4f22-a074-742aa323ecaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-7162caab-abba-4645-9346-0b73db7ec75a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7162caab-abba-4645-9346-0b73db7ec75a
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7162caab-abba-4645-9346-0b73db7ec75a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5bf606c-9575-4b44-9a7d-47d7e573ce3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5bf606c-9575-4b44-9a7d-47d7e573ce3a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5bf606c-9575-4b44-9a7d-47d7e573ce3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-092e29e4-dcc4-498c-9dee-fe7db0263456

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-092e29e4-dcc4-498c-9dee-fe7db0263456
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-092e29e4-dcc4-498c-9dee-fe7db0263456
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-4420e710-4395-4f15-bee1-afaf2129b716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4420e710-4395-4f15-bee1-afaf2129b716
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4420e710-4395-4f15-bee1-afaf2129b716
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-75a463dd-a01a-4c9f-8378-cb03e918c99c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75a463dd-a01a-4c9f-8378-cb03e918c99c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-75a463dd-a01a-4c9f-8378-cb03e918c99c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-2765f300-69c1-45d3-afbb-6774cf7933e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2765f300-69c1-45d3-afbb-6774cf7933e7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2765f300-69c1-45d3-afbb-6774cf7933e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-d717733a-d75a-46a1-a3f5-dd85531b8dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d717733a-d75a-46a1-a3f5-dd85531b8dc4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d717733a-d75a-46a1-a3f5-dd85531b8dc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c31aa47-080e-4d3e-8a52-182cf2279632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c31aa47-080e-4d3e-8a52-182cf2279632
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c31aa47-080e-4d3e-8a52-182cf2279632
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-654c3f19-03aa-478c-a9bd-704a82b5d104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654c3f19-03aa-478c-a9bd-704a82b5d104
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-654c3f19-03aa-478c-a9bd-704a82b5d104
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3fde8fc-6477-4bc9-a93a-42ea0ecd66a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3fde8fc-6477-4bc9-a93a-42ea0ecd66a3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3fde8fc-6477-4bc9-a93a-42ea0ecd66a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-4afdf032-89b6-4bf8-9ec4-50a771a81f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4afdf032-89b6-4bf8-9ec4-50a771a81f67
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4afdf032-89b6-4bf8-9ec4-50a771a81f67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1afd042-9a61-4de0-b340-7739f31cb898

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1afd042-9a61-4de0-b340-7739f31cb898
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1afd042-9a61-4de0-b340-7739f31cb898
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-63db563d-524c-4092-bd4b-84e79b9d4aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63db563d-524c-4092-bd4b-84e79b9d4aec
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-63db563d-524c-4092-bd4b-84e79b9d4aec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-63477bab-175f-4821-8aad-da1c051e4fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63477bab-175f-4821-8aad-da1c051e4fcc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-63477bab-175f-4821-8aad-da1c051e4fcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c56f9af-0b43-4d60-9a39-a62742fa8368

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c56f9af-0b43-4d60-9a39-a62742fa8368
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c56f9af-0b43-4d60-9a39-a62742fa8368
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2f8e945-b3b7-4794-ac41-7d3834d30175

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2f8e945-b3b7-4794-ac41-7d3834d30175
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2f8e945-b3b7-4794-ac41-7d3834d30175
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4789514-c052-4bc7-a76c-c892812e08d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4789514-c052-4bc7-a76c-c892812e08d2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4789514-c052-4bc7-a76c-c892812e08d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-412e43ac-4ad8-43b9-ad0e-443d48d9e3f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412e43ac-4ad8-43b9-ad0e-443d48d9e3f8
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-412e43ac-4ad8-43b9-ad0e-443d48d9e3f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bb6d5b2-f283-4e3b-b6c3-ec6c827c1aae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bb6d5b2-f283-4e3b-b6c3-ec6c827c1aae
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bb6d5b2-f283-4e3b-b6c3-ec6c827c1aae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-f311ed6c-3c84-4d90-9943-26a40f85cfa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f311ed6c-3c84-4d90-9943-26a40f85cfa2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f311ed6c-3c84-4d90-9943-26a40f85cfa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-bad73ba5-41ce-4d9d-968c-1ca00c73dd84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad73ba5-41ce-4d9d-968c-1ca00c73dd84
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-bad73ba5-41ce-4d9d-968c-1ca00c73dd84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0877d5d-47a9-49d0-b132-2a46571dd7f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0877d5d-47a9-49d0-b132-2a46571dd7f0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0877d5d-47a9-49d0-b132-2a46571dd7f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-d15998a0-5dbf-4a0e-98c5-0651fedcc92c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15998a0-5dbf-4a0e-98c5-0651fedcc92c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d15998a0-5dbf-4a0e-98c5-0651fedcc92c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4d79c3e-38cc-425b-893e-ef33dba9abfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4d79c3e-38cc-425b-893e-ef33dba9abfd
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4d79c3e-38cc-425b-893e-ef33dba9abfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-92cb6fb1-f69b-4fb7-993b-004916a68bc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92cb6fb1-f69b-4fb7-993b-004916a68bc7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-92cb6fb1-f69b-4fb7-993b-004916a68bc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-aeccfcfb-ecde-434a-86f4-c5163476d508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeccfcfb-ecde-434a-86f4-c5163476d508
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeccfcfb-ecde-434a-86f4-c5163476d508
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-24ef6213-8629-4bfb-b01b-ceb83b32afbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ef6213-8629-4bfb-b01b-ceb83b32afbb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-24ef6213-8629-4bfb-b01b-ceb83b32afbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-eca87c87-12c1-4418-a207-28ddf4a5027b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eca87c87-12c1-4418-a207-28ddf4a5027b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-eca87c87-12c1-4418-a207-28ddf4a5027b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9235967-326f-497e-a144-2489406a5711

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9235967-326f-497e-a144-2489406a5711
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9235967-326f-497e-a144-2489406a5711
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-840f4237-1d32-4665-9476-4e34f4d82a7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-840f4237-1d32-4665-9476-4e34f4d82a7b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-840f4237-1d32-4665-9476-4e34f4d82a7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-87545c6a-da9f-4eb8-a0ae-3fb48d2e85a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87545c6a-da9f-4eb8-a0ae-3fb48d2e85a9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-87545c6a-da9f-4eb8-a0ae-3fb48d2e85a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-4fa05b72-870f-432a-af81-d6953326e412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fa05b72-870f-432a-af81-d6953326e412
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fa05b72-870f-432a-af81-d6953326e412
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-eaa67660-57de-42b9-8ea2-cddd2477e5db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaa67660-57de-42b9-8ea2-cddd2477e5db
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaa67660-57de-42b9-8ea2-cddd2477e5db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-967ebad0-c54e-4fcc-ad4c-524dd94cfe31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-967ebad0-c54e-4fcc-ad4c-524dd94cfe31
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-967ebad0-c54e-4fcc-ad4c-524dd94cfe31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddfe7c8f-614f-45d5-b036-768d81a4ebd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddfe7c8f-614f-45d5-b036-768d81a4ebd9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddfe7c8f-614f-45d5-b036-768d81a4ebd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c3ab420-4ce1-48f6-a553-094a34347286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c3ab420-4ce1-48f6-a553-094a34347286
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c3ab420-4ce1-48f6-a553-094a34347286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-73a8e16e-4607-4bd2-af84-134c00bdaef2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73a8e16e-4607-4bd2-af84-134c00bdaef2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-73a8e16e-4607-4bd2-af84-134c00bdaef2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e649e5e-b4bf-4857-a6f5-45d375c7d173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e649e5e-b4bf-4857-a6f5-45d375c7d173
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e649e5e-b4bf-4857-a6f5-45d375c7d173
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa1f0cd2-8b5e-421e-8a3b-2309477e5efd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa1f0cd2-8b5e-421e-8a3b-2309477e5efd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa1f0cd2-8b5e-421e-8a3b-2309477e5efd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-1fd72aeb-528d-41e9-bf8e-63db60c603df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fd72aeb-528d-41e9-bf8e-63db60c603df
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fd72aeb-528d-41e9-bf8e-63db60c603df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-77aaab17-ca3a-43d3-b66c-9ea5213ba1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77aaab17-ca3a-43d3-b66c-9ea5213ba1b3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-77aaab17-ca3a-43d3-b66c-9ea5213ba1b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf846a6e-e496-4de1-8ac7-17d4ece4e38c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf846a6e-e496-4de1-8ac7-17d4ece4e38c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf846a6e-e496-4de1-8ac7-17d4ece4e38c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-55056a58-127b-4101-b071-a4a39a86ab14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55056a58-127b-4101-b071-a4a39a86ab14
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-55056a58-127b-4101-b071-a4a39a86ab14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-2aacd602-cbb2-41a2-9d4c-b9d77a762b28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aacd602-cbb2-41a2-9d4c-b9d77a762b28
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aacd602-cbb2-41a2-9d4c-b9d77a762b28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-04080894-ef65-447e-bc08-86e16ecf5fb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04080894-ef65-447e-bc08-86e16ecf5fb5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-04080894-ef65-447e-bc08-86e16ecf5fb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-26dca19d-7191-4d23-807a-298e410ca355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26dca19d-7191-4d23-807a-298e410ca355
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-26dca19d-7191-4d23-807a-298e410ca355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-73b164fc-754e-4648-b242-b4839c285806

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b164fc-754e-4648-b242-b4839c285806
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-73b164fc-754e-4648-b242-b4839c285806
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-e42b8d66-eb07-491b-a5cb-e076dd370306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42b8d66-eb07-491b-a5cb-e076dd370306
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42b8d66-eb07-491b-a5cb-e076dd370306
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-f75df214-99ff-4592-90b3-b4f15dc9583f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f75df214-99ff-4592-90b3-b4f15dc9583f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f75df214-99ff-4592-90b3-b4f15dc9583f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-dce753c8-670c-40e5-a885-decc06b4348e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce753c8-670c-40e5-a885-decc06b4348e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-dce753c8-670c-40e5-a885-decc06b4348e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a1f75be-7f0e-4f55-b3dd-bdc22da8a930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a1f75be-7f0e-4f55-b3dd-bdc22da8a930
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a1f75be-7f0e-4f55-b3dd-bdc22da8a930
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe9e64d2-45be-48da-859c-9df2e64e4743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe9e64d2-45be-48da-859c-9df2e64e4743
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe9e64d2-45be-48da-859c-9df2e64e4743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1baa069-8770-4125-92a2-7ea136e576c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1baa069-8770-4125-92a2-7ea136e576c7
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1baa069-8770-4125-92a2-7ea136e576c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe3487ae-b415-43ab-8efc-78d08eb81383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe3487ae-b415-43ab-8efc-78d08eb81383
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe3487ae-b415-43ab-8efc-78d08eb81383
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fe3487ae-b415-43ab-8efc-78d08eb81383"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-4503e8ba-3106-4fee-966c-d2c306da31af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4503e8ba-3106-4fee-966c-d2c306da31af
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4503e8ba-3106-4fee-966c-d2c306da31af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4503e8ba-3106-4fee-966c-d2c306da31af"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f34b714-6453-4dac-9583-ca6626bc1c6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f34b714-6453-4dac-9583-ca6626bc1c6b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f34b714-6453-4dac-9583-ca6626bc1c6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2f34b714-6453-4dac-9583-ca6626bc1c6b"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-fbfabc31-02e3-4974-8af8-475264eb5fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbfabc31-02e3-4974-8af8-475264eb5fbf
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbfabc31-02e3-4974-8af8-475264eb5fbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fbfabc31-02e3-4974-8af8-475264eb5fbf"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-8040017a-6b6b-425c-81c6-170b415b641d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8040017a-6b6b-425c-81c6-170b415b641d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8040017a-6b6b-425c-81c6-170b415b641d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8040017a-6b6b-425c-81c6-170b415b641d"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-1faa39ce-14e3-4d33-9fea-870ff3214172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1faa39ce-14e3-4d33-9fea-870ff3214172
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1faa39ce-14e3-4d33-9fea-870ff3214172
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1faa39ce-14e3-4d33-9fea-870ff3214172"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-72985e76-d84a-460d-bd67-8c6ee4c95f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72985e76-d84a-460d-bd67-8c6ee4c95f8b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72985e76-d84a-460d-bd67-8c6ee4c95f8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-72985e76-d84a-460d-bd67-8c6ee4c95f8b"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa56c1bc-650f-4d79-8064-11b25d37c57c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa56c1bc-650f-4d79-8064-11b25d37c57c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa56c1bc-650f-4d79-8064-11b25d37c57c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fa56c1bc-650f-4d79-8064-11b25d37c57c"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-12bbda02-40b9-4653-a79f-fca0cbd72df0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12bbda02-40b9-4653-a79f-fca0cbd72df0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12bbda02-40b9-4653-a79f-fca0cbd72df0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-12bbda02-40b9-4653-a79f-fca0cbd72df0"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b21bc1d-2f77-4ecf-8160-af886102b238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b21bc1d-2f77-4ecf-8160-af886102b238
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b21bc1d-2f77-4ecf-8160-af886102b238
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3b21bc1d-2f77-4ecf-8160-af886102b238"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-2070e57e-d419-42b9-a575-8eb51bdcd7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2070e57e-d419-42b9-a575-8eb51bdcd7ab
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2070e57e-d419-42b9-a575-8eb51bdcd7ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2070e57e-d419-42b9-a575-8eb51bdcd7ab"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e74bc52-67de-4744-a416-82a1cfa15fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e74bc52-67de-4744-a416-82a1cfa15fb2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e74bc52-67de-4744-a416-82a1cfa15fb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7e74bc52-67de-4744-a416-82a1cfa15fb2"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-440e6223-335e-4e33-9f8f-5755bb81d079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-440e6223-335e-4e33-9f8f-5755bb81d079
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-440e6223-335e-4e33-9f8f-5755bb81d079
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-440e6223-335e-4e33-9f8f-5755bb81d079"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-11c45541-ad13-4eec-9c2c-5ca78ed9dfd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c45541-ad13-4eec-9c2c-5ca78ed9dfd2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11c45541-ad13-4eec-9c2c-5ca78ed9dfd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-11c45541-ad13-4eec-9c2c-5ca78ed9dfd2"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-5805b7de-4776-4f5b-92b1-ae7455f3b549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5805b7de-4776-4f5b-92b1-ae7455f3b549
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5805b7de-4776-4f5b-92b1-ae7455f3b549
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5805b7de-4776-4f5b-92b1-ae7455f3b549"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f1ee28d-787e-4d53-bd7f-c12875db88ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f1ee28d-787e-4d53-bd7f-c12875db88ea
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f1ee28d-787e-4d53-bd7f-c12875db88ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1f1ee28d-787e-4d53-bd7f-c12875db88ea"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-654ecac1-235b-44e1-af6f-9a676a83cb1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654ecac1-235b-44e1-af6f-9a676a83cb1e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-654ecac1-235b-44e1-af6f-9a676a83cb1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-654ecac1-235b-44e1-af6f-9a676a83cb1e"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-de124e5b-2f32-4c83-801d-00f896c5fa06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de124e5b-2f32-4c83-801d-00f896c5fa06
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de124e5b-2f32-4c83-801d-00f896c5fa06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-de124e5b-2f32-4c83-801d-00f896c5fa06"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ad5aaa1-1bf6-4df1-a83a-f49a1b08364b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ad5aaa1-1bf6-4df1-a83a-f49a1b08364b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ad5aaa1-1bf6-4df1-a83a-f49a1b08364b
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
Content-Length: 181

{"id":"acc_0234f6e5-4c4a-4fc4-a207-8411fd9d203d","handle":"qa-6fa1bb90161d","displayName":"QA 6fa1bb90161d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.012596921Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f719ee10-9078-4b8d-8c3a-cdd8a363d882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f719ee10-9078-4b8d-8c3a-cdd8a363d882
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f719ee10-9078-4b8d-8c3a-cdd8a363d882
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-6573ec42-407c-4041-bdbc-f93fdce6cfd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6573ec42-407c-4041-bdbc-f93fdce6cfd0
Content-Type: application/json

--- request body ---
{"handle":"qa-6fa1bb90161d","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6573ec42-407c-4041-bdbc-f93fdce6cfd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6573ec42-407c-4041-bdbc-f93fdce6cfd0"}
```
